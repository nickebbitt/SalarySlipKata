package org.neomatrix369.salaryslip;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalarySlipGeneratorShould {

    @Test
    public void generateSalarySlipWithEmployeeID() {

        final Employee employee = new Employee(12345, "John Doe", 24_000);

        final SalarySlipGenerator sut = new SalarySlipGenerator();
        SalarySlip salarySlip = sut.generateFor(employee);

        assertEquals(12345, salarySlip.employeeID());

    }

    @Test
    public void generateSalarySlipWithEmployeeName() {

        final Employee employee = new Employee(12345, "John Doe", 24_000);

        final SalarySlipGenerator sut = new SalarySlipGenerator();
        SalarySlip salarySlip = sut.generateFor(employee);

        assertEquals(12345, salarySlip.employeeID());
        assertEquals("John Doe", salarySlip.employeeName());

    }

    @Test
    public void generateSalarySlipWithGrossMonthlySalary() {

        final Employee employee = new Employee(12345, "John Doe", 24_000);

        final SalarySlipGenerator sut = new SalarySlipGenerator();
        SalarySlip salarySlip = sut.generateFor(employee);

        assertEquals(12345, salarySlip.employeeID());
        assertEquals("John Doe", salarySlip.employeeName());
        assertEquals(2_000, salarySlip.grossSalary());

    }


}
