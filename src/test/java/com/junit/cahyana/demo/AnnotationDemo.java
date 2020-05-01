package com.junit.cahyana.demo;

import org.junit.*;

public class AnnotationDemo {

    // execute before class
    @BeforeClass
    public static void beforeClass() {
        System.out.println("In before class");
    }

    // execute after class
    @AfterClass
    public static void afterClass() {
        System.out.println("In after class");
    }

    // execute before test
    @Before
    public void before() {
        System.out.println("In before test");
    }

    // execute after test
    @After
    public void after() {
        System.out.println("In after test");
    }

    // test
    @Test
    public void test() {
        System.out.println("In test");
    }

    // ignore and will not execute
    @Ignore
    public void ignoreTest() {
        System.out.println("In ignore test");
    }
}
