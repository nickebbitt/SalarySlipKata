package org.neomatrix369.salaryslip;

class SalarySlipGenerator {

    SalarySlip generateFor(Employee employee) {
        final int grossMonthlySalary = calculateGrossMonthlySalary(employee);

        return new SalarySlip(employee.getEmployeeID(), employee.getEmployeeName(), grossMonthlySalary);
    }

    private int calculateGrossMonthlySalary(Employee employee) {
        return employee.grossAnnualSalary() / 12;
    }
}
