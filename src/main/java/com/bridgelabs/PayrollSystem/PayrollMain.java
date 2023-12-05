package com.bridgelabs.PayrollSystem;

import java.util.ArrayList;
import java.util.List;

public class PayrollMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Payroll Service");
		List<EmployeePayroll> employeePayrollList = new ArrayList<>();
		PayrollService payrollService = new PayrollService(employeePayrollList);
		payrollService.addEmployeeToPayroll();
		payrollService.printEmployeePayroll();
	}

}
