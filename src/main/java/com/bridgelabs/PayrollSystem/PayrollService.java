package com.bridgelabs.PayrollSystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * @Description: Payroll Service to Read and Write Employee Payroll to a Console
 * 
 * @Class Variables: PayrollList
 * 
 * @Methods: addEmployeeToPayroll()
 */
public class PayrollService {

	private List<EmployeePayroll> PayrollList = new ArrayList<EmployeePayroll>();

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
		PayrollList.add(employeePayroll);
	}

	/*
	 * @Description: Method to write the employee details into a file
	 * 
	 * @Param: void
	 * 
	 * @Return: void
	 */

	void writeEmployeeintoFile() {
		String allEmployeeData = PayrollList.stream()
				.map(EmployeePayroll::toString)
				.collect(Collectors.joining("\n"));

		System.out.println("Employee data to be saved:\n" + allEmployeeData);

		try {
			Files.write(Paths.get(FILE_PATH), allEmployeeData.getBytes(), StandardOpenOption.CREATE,
					StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
			System.out.println("Employee data successfully saved to the file.");
		} catch (IOException e) {
			System.out.println("Error occurred while saving employee data to the file:");
			e.printStackTrace();
		}
	}

	/*
	 * @Description: Method to count the number of entries in the file and printing
	 * the lines in file
	 *
	 * @Param: void
	 *
	 * @Return: void
	 */
	void readEmployeeFromFile() {
		try {
			List<String> lines = Files.readAllLines(Paths.get(FILE_PATH));
			lines.forEach(System.out::println);
			System.out.println("Number of entries: " + lines.size());
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
		for (EmployeePayroll employeePayroll : PayrollList) {
			System.out.println("Employee Details: " + employeePayroll.toString());
			System.out.println();
		}

	}

}
