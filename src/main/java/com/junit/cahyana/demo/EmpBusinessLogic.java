package com.junit.cahyana.demo;

public class EmpBusinessLogic {

    // Calculate the yearly salary of employee
    public double calculateYearlySalary(Employee employee) {
        double yearlySalary = 0;
        yearlySalary = employee.getMonthlySalary() * 12;
        return yearlySalary;
    }

    // Calculate the appraisal amount of employee
    public double calculateAppraisal(Employee employee) {
        double appraisal = 0;

        if (employee.getMonthlySalary() < 10_000) {
            appraisal = 500;
        } else {
            appraisal = 1000;
        }

        return appraisal;
    }
}
