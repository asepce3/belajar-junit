package com.junit.cahyana.demo.mockito;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

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
    }

    @Test
    public void testSubtract() {
        when(calculatorService.substract(5.0, 3.0)).thenReturn(2.0);
        TestCase.assertEquals(mathApplication.substract(5.0, 3.0), 6.0);
    }

    @Test
    public void testMultiply() {
        when(calculatorService.multiply(5.0, 4.0)).thenReturn(20.0);
        TestCase.assertEquals(mathApplication.multiply(5.0, 4.0), 60.0);
    }

    @Test
    public void testDivide() {
        when(calculatorService.divide(24.0, 3.0)).thenReturn(8.0);
        TestCase.assertEquals(mathApplication.divide(24.0, 3.0), 24.0);
    }
}
