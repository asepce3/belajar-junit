package com.junit.cahyana.demo.mockito;

public class MathApplication {
    private CalculatorService calculatorService;

    public void setCalculatorService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public double add(double a, double b) {
        return 2 * calculatorService.add(a, b);
    }

    public double substract(double a, double b) {
        return 3 * calculatorService.substract(a, b);
    }

    public double multiply(double a, double b) {
        return 3 * calculatorService.multiply(a, b);
    }

    public double divide(double a, double b) {
        return 3 * calculatorService.divide(a, b);
    }
}
