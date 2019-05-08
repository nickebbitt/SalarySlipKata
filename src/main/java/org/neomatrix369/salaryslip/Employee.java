package org.neomatrix369.salaryslip;

public class Employee {
    private final int employeeID;
    private final String employeeName;
    private final int grossAnnualSalary;

    public Employee(int employeeID, String employeeName, int grossAnnualSalary) {

        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.grossAnnualSalary = grossAnnualSalary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int grossAnnualSalary() {
        return grossAnnualSalary;
    }
}
