package com.junit.cahyana.demo;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class TestCaseDemo extends TestCase {

    protected double val1;
    protected double val2;

    @Before
    public void setUp() {
        val1 = 2.0;
        val2 = 3.0;
    }

    @Test
    public void testAdd() {
        // count the number of test cases
        System.out.println("No of Test case = " + this.countTestCases());

        // test getName
        String name = this.getName();
        System.out.println("Test case name = " + name);

        // test setName
        this.setName("testNewAdd");
        String newName = this.getName();
        System.out.println("Updated test case name = " + newName);
    }

    // tearDown used to close the connection or clean up activities
    public void tearDown() {}
}
