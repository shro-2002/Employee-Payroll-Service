package com.bridgelabs.PayrollSystem;

/*
 * @Description: Employee Payroll Service to Read and Write Employee Payroll to a Console
 * 
 * @Class Variables: name, empID, salary
 * 
 * @Methods: getName(), getEmpID(), getSalary(), setName(), setEmpID(), setSalary()
 * 
 */
public class EmployeePayroll {

	private String name;
	private int empID;
	private int salary;

	/*
	 * @Description: Parameterized Constructor to initialize the variables
	 * 
	 * @Param: name, empID, salary
	 * 
	 * @Return: void
	 * 
	 */
	public EmployeePayroll(String name, int empID, int salary) {
		this.name = name;
		this.empID = empID;
		this.salary = salary;
	}

	/*
	 * @Description: Getter Methods to get the name of the employee
	 * 
	 * @Param: void
	 * 
	 * @Return: name
	 * 
	 */
	public String getName() {
		return name;
	}

	/*
	 * @Description: Getter Methods to get the employee ID
	 * 
	 * @Param: void
	 * 
	 * @Return: empID
	 * 
	 */
	public int getEmpID() {
		return empID;
	}

	/*
	 * @Description: Getter Methods to get the salary of the employee
	 * 
	 * @Param: void
	 * 
	 * @Return: salary
	 * 
	 */
	public int getSalary() {
		return salary;
	}

	/*
	 * @Description: Setter Methods to set the name of the employee
	 * 
	 * @Param: name
	 * 
	 * @Return: void
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * @Description: Setter Methods to set the employee ID
	 * 
	 * @Param: empID
	 * 
	 * @Return: void
	 * 
	 */
	public void setEmpID(int empID) {
		this.empID = empID;
	}

	/*
	 * @Description: Setter Methods to set the salary of the employee
	 * 
	 * @Param: salary
	 * 
	 * @Return: void
	 * 
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/*
	 * @Description: Overriding toString() method to print the details of the
	 * employee
	 * 
	 * @Param: void
	 * 
	 * @Return: String
	 * 
	 */
	@Override
	public String toString() {
		return "\nName: " + getName() + "\nEmployee ID: " + getEmpID() + "\nSalary: " + getSalary();
	}

}
