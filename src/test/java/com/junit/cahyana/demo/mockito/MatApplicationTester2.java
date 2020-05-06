package com.junit.cahyana.demo.mockito;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)
public class MatApplicationTester2 {

    private MathApplication mathApplication;
    private CalculatorService calculatorService;

    @Before
    public void setUp() {
        mathApplication = new MathApplication();
        Calculator calculator = new Calculator();
        calculatorService = spy(calculator);
        mathApplication.setCalculatorService(calculatorService);
    }

    @Test
    public void testAdd() {
        // perform operation on real object
        // test the add functionality
        TestCase.assertEquals(mathApplication.add(20.0, 10.0), 60.0);
    }

    class Calculator implements CalculatorService {

        @Override
        public double add(double a, double b) {
            return a + b;
        }

        @Override
        public double substract(double a, double b) {
            throw new UnsupportedOperationException("Method not implemented yet!");
        }

        @Override
        public double multiply(double a, double b) {
            throw new UnsupportedOperationException("Method not implemented yet!");
        }

        @Override
        public double divide(double a, double b) {
            throw new UnsupportedOperationException("Method not implemented yet!");
        }
    }
}
