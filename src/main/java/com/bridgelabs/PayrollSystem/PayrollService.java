package com.bridgelabs.PayrollSystem;

import java.util.List;
import java.util.Scanner;

/*
 * @Description: Payroll Service to Read and Write Employee Payroll to a Console
 * 
 * @Class Variables: employeePayrollList
 * 
 * @Methods: addEmployeeToPayroll()
 */
public class PayrollService {

	private List<EmployeePayroll> employeePayrollList;

	/*
	 * @Description: Parameterized Constructor to initialize the List
	 * 
	 * @Param: employeePayrollList
	 * 
	 * @Return: void
	 * 
	 */
	public PayrollService(List<EmployeePayroll> employeePayrollList) {
		this.employeePayrollList = employeePayrollList;
	}

	/*
	 * @Description: Method to create and add the employee details to the list
	 * 
	 * @Param: void
	 * 
	 * @Return: void
	 * 
	 */

	public void addEmployeeToPayroll() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Employee ID: ");
		int empID = sc.nextInt();
		System.out.println("Enter Employee Salary: ");
		int salary = sc.nextInt();
		EmployeePayroll employeePayroll = new EmployeePayroll(name, empID, salary);
		employeePayrollList.add(employeePayroll);
	}

	/*
	 * @Description: Method to print the employee details from the list
	 * 
	 * @Param: void
	 * 
	 * @Return: void
	 * 
	 */

	public void printEmployeePayroll() {
		for (EmployeePayroll employeePayroll : employeePayrollList) {
			System.out.println("Employee Details: " + employeePayroll.toString());
		}

	}

}
