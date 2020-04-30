package com.junit.cahyana.demo.fixture;

import junit.framework.TestCase;
import org.junit.Test;

public class TestJUnit1 {

    String msg = "Cahyana";
    MessageUtil messageUtil = new MessageUtil(msg);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        TestCase.assertEquals(msg, messageUtil.printMessage());
    }
}
