package com.bridgelabs.PayrollSystem;

import java.util.Scanner;

public class PayrollMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Payroll Service");

		PayrollService payrollService = new PayrollService();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no. of Employees");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			payrollService.addEmployeeToPayroll();
		}
		payrollService.printEmployeePayroll();
		payrollService.writeEmployeeintoFile();
	}

}
