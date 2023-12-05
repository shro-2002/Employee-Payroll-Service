package com.bridgelabs.PayrollSystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
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

	private List<EmployeePayroll> employeePayrollList = new ArrayList<EmployeePayroll>();

	private static final String FILE_PATH = "employee.txt";

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
	 * @Description: Method to write the employee details into a file
	 * 
	 * @Param: void
	 * 
	 * @Return: void
	 */

	void writeEmployeeintoFile() {
		StringBuffer empBuffer = new StringBuffer();
		employeePayrollList.forEach(employee -> {
			String employeeDataString = employee.toString().concat("\n");
			empBuffer.append(employeeDataString);
		});

		System.out.println(empBuffer.toString());
		try {
			Files.write(Paths.get(FILE_PATH), empBuffer.toString().getBytes(), StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		}
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
			System.out.println();
		}

	}

}
