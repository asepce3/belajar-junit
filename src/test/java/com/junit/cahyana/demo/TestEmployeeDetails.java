package com.junit.cahyana.demo;

import junit.framework.TestCase;
import org.junit.Test;

public class TestEmployeeDetails {

    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    Employee employee = new Employee();

    // test to check appraisal
    @Test
    public void testCalculateAppraisal() {
        employee.setName("Asep");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        TestCase.assertEquals(500, appraisal, 0.0);
    }

    // test to check yearly salary
    @Test
    public void testCalculateYearlySalary() {
        employee.setName("Asep");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        double salary = empBusinessLogic.calculateYearlySalary(employee);
        TestCase.assertEquals(96000, salary, 0.0);
    }
}
