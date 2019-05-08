package org.neomatrix369.salaryslip;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalarySlipGeneratorShould {

    @Test
    public void generateSalarySlipWithEmployeeID() {

        final Employee employee = new Employee(12345);

        final SalarySlipGenerator sut = new SalarySlipGenerator();
        SalarySlip salarySlip = sut.generateFor(employee);

        assertEquals(12345, salarySlip.employeeID());

    }

}
