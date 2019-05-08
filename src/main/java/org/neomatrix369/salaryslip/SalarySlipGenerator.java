package org.neomatrix369.salaryslip;

public class SalarySlipGenerator {

    public SalarySlip generateFor(Employee employee) {
        return new SalarySlip(employee.getEmployeeID());
    }
}
