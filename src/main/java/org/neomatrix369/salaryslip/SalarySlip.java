package org.neomatrix369.salaryslip;

public class SalarySlip {
    private final int employeeID;
    private final String employeeName;
    private final int grossMonthlySalary;

    public SalarySlip(int employeeID, String employeeName, int grossMonthlySalary) {

        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.grossMonthlySalary = grossMonthlySalary;
    }

    int employeeID() {
        return employeeID;
    }

    String employeeName() {
        return employeeName;
    }

    public int grossMonthlySalary() {
        return grossMonthlySalary;
    }
}
