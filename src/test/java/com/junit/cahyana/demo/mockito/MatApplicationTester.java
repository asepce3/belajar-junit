package com.junit.cahyana.demo.mockito;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MatApplicationTester {

    // @InjectMocks annotations is used to create and inject the mock object
    @InjectMocks
    MathApplication mathApplication = new MathApplication();

    // @Mock annotations is used to create the mock object to be injected
    @Mock
    CalculatorService calculatorService;

    @Test
    public void testAdd() {
        // add the behavior of calc service to add two numbers
        when(calculatorService.add(10.0, 20.0)).thenReturn(30.0);

        // test the add functionality
        TestCase.assertEquals(mathApplication.add(10.0, 20.0), 60.0);
        // limit the method call to 1, no less and no more calls are allowed
        verify(calculatorService, times(1)).add(10.0, 20.0);
    }

    @Test
    public void testSubtract() {
        when(calculatorService.substract(5.0, 3.0)).thenReturn(2.0);
        TestCase.assertEquals(mathApplication.substract(5.0, 3.0), 6.0);
        TestCase.assertEquals(mathApplication.substract(5.0, 3.0), 6.0);
        // check if substract method is called minimum 2 times
        verify(calculatorService, atLeast(2)).substract(5.0, 3.0);
    }

    @Test
    public void testMultiply() {
        when(calculatorService.multiply(5.0, 4.0)).thenReturn(20.0);
        TestCase.assertEquals(mathApplication.multiply(5.0, 4.0), 60.0);
        // check if multiply method is called minimu 1 time
        verify(calculatorService, atLeastOnce()).multiply(5.0, 4.0);
    }

    @Test
    public void testDivide() {
        when(calculatorService.divide(24.0, 3.0)).thenReturn(8.0);
        TestCase.assertEquals(mathApplication.divide(24.0, 3.0), 24.0);

        // check if devide method is called maximum 3 times
        verify(calculatorService, atMost(3)).divide(24.0, 3.0);
    }

    @Test
    public void testAddException() {
        // add the behavior to throw exception
        doThrow(new RuntimeException("Add operation not implemented"))
                .when(calculatorService).add(3.0, 4.0);

        // test the add functionality
        TestCase.assertEquals(mathApplication.add(3.0, 4.0), 7.0);
    }

    @Test
    public void testAddAndSubtract() {
        when(calculatorService.add(20.0, 10.0)).thenReturn(30.0);
        when(calculatorService.substract(20.0, 10.0)).thenReturn(10.0);

        TestCase.assertEquals(mathApplication.substract(20.0, 10.0), 30.0);
        TestCase.assertEquals(mathApplication.add(20.0, 10.0), 60.0);

        // create an inOrder verifier for a single mock
        InOrder inOrder = inOrder(calculatorService);
        // memastikan bahwa add dipanggil sesudah substract
        inOrder.verify(calculatorService).substract(20, 10);
        inOrder.verify(calculatorService).add(20, 10);
    }

    @Test
    public void testCallback() {
        when(calculatorService.add(3.0, 2.0)).thenAnswer(new Answer<Double>() {
            @Override
            public Double answer(InvocationOnMock invocationOnMock) throws Throwable {
                double d = 0.0;
                Object[] objects = invocationOnMock.getArguments();
                for (Object o : objects) {
                    d += (double) o;
                }

                Object mock = invocationOnMock.getMock();
                return d;
            }
        });

        TestCase.assertEquals(mathApplication.add(3.0, 2.0), 10.0);
    }
}
