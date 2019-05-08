package org.neomatrix369.salaryslip;

public class SalarySlip {
    private final int employeeID;
    private final String employeeName;

    public SalarySlip(int employeeID, String employeeName) {

        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    int employeeID() {
        return employeeID;
    }

    String employeeName() {
        return employeeName;
    }

    public int grossSalary() {
        return 0;
    }
}
