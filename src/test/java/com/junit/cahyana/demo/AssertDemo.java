package com.junit.cahyana.demo;

import junit.framework.TestCase;
import org.junit.Test;

public class AssertDemo {

    @Test
    public void testAdd() {
        // test data
        int num = 5;
        String temp = "";
        String str = "Junit is working fine";

        // check for equality
        TestCase.assertEquals("Junit is working fine", str);

        // check for false condition
        TestCase.assertFalse(num > 6);

        // check for not null value
        // test ini akan gagal karena temp = null
        TestCase.assertNotNull(temp);
    }
}
