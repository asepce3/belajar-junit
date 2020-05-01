package com.junit.cahyana.demo;

import org.junit.Test;

public class ExceptionDemo {

    MathUtil mathUtil = new MathUtil();

    @Test(expected = ArithmeticException.class)
    public void testDevide() {
        mathUtil.devide(1, 0);
    }
}
