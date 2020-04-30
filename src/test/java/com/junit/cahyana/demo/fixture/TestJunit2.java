package com.junit.cahyana.demo.fixture;

import junit.framework.TestCase;
import org.junit.Test;

public class TestJunit2 {
    String msg = "Asep";
    MessageUtil messageUtil = new MessageUtil(msg);

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        msg = "Hi!" + "Asep";
        TestCase.assertEquals(msg, messageUtil.salutationMessage());
    }
}
