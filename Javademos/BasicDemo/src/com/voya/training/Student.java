package com.voya.training;

public class Student {
	
	int studentId;
	String studentName;
	String department;
	String usn;
	String city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.studentId = 1;
		student1.studentName = "Kavya";
		student1.department = "ECE";
		student1.usn = "1KG19EC049";
		student1.city = "Bangalore";
		System.out.println("student ID" + " " + student1.studentId);
		System.out.println("student Name" + " " + student1.studentName);
		System.out.println("department" + " " + student1.department);
		System.out.println("usn" + " " + student1.usn);
		System.out.println("city" + " " + student1.city);
		
		System.out.println( " ");
		
		Student student2 = new Student();
		student2.studentId = 2;
		student2.studentName = "Keerthana";
		student2.department = "cse";
		student2.usn = "1KG19EC053";
		student2.city = "Bangalore";
		System.out.println("student ID" + " " + student2.studentId);
		System.out.println("student Name" + " " + student2.studentName);
		System.out.println("department" + " " + student2.department);
		System.out.println("usn" + " " + student2.usn);
		System.out.println("city" + " " + student2.city);
		
	}

}
