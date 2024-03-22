package com.oops.basics;

public class Employee {

	String employeeName;
	int employeeId;
	double salary;
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.employeeName = "Raju";
		employee.employeeId=12;
		employee.salary=2000;
		System.out.println("Name " + employee.employeeName);
		System.out.println("Id " + employee.employeeId);
		System.out.println("Id " + employee.salary);
		
		//create the second object
		Employee employee1 = new Employee();
		employee1.employeeName = "Ramesh";
		employee1.employeeId=14;
		employee1.salary=2500;
		System.out.println("emp1 Name " + employee1.employeeName);
		System.out.println("emp1 Id " + employee1.employeeId);
		System.out.println("emp1 Id " + employee1.salary);
		
		Employee employee2 = employee;
		System.out.println("emp2 Name " + employee2.employeeName);
		
		employee2.employeeName = "Teena";
		System.out.println("emp1 Name " + employee1.employeeName);
		System.out.println("emp2 Name " + employee2.employeeName);
		
		employee = null;
		System.out.println("emp1 Name " + employee1.employeeName);
		System.out.println("emp2 Name " + employee2.employeeName);
	}
}
