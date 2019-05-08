package org.neomatrix369.salaryslip;

public class Employee {
    private final int employeeID;
    private final String employeeName;

    public Employee(int employeeID, String employeeName, int i) {

        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}
