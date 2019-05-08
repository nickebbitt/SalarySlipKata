package org.neomatrix369.salaryslip;

public class SalarySlipGenerator {

    public SalarySlip generateFor(Employee employee) {
        final int grossMonthlySalary = employee.grossAnnualSalary() / 12;
        return new SalarySlip(employee.getEmployeeID(), employee.getEmployeeName(), grossMonthlySalary);
    }
}
