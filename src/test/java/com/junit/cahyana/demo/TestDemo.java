package com.junit.cahyana.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDemo {

    @Test
    public void testAdd() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine", str);
    }
}
