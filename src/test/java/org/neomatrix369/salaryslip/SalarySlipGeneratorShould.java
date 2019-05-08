package org.neomatrix369.salaryslip;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalarySlipGeneratorShould {

    private SalarySlip salarySlip;

    @Before
    public void setup() {
        Employee employee = new Employee(12345, "John Doe", 24_000);
        SalarySlipGenerator sut = new SalarySlipGenerator();
        salarySlip = sut.generateFor(employee);
    }

    @Test
    public void generateSalarySlipWithEmployeeID() {
        assertEquals(12345, salarySlip.employeeID());
    }

    @Test
    public void generateSalarySlipWithEmployeeName() {
        assertEquals("John Doe", salarySlip.employeeName());
    }

    @Test
    public void generateSalarySlipWithGrossMonthlySalary() {
        assertEquals(2_000, salarySlip.grossMonthlySalary());
    }


}
