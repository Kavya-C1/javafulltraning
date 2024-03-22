package com.voya.training;

import java.util.*;
public class ScanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name, EmployeeId, city, salary");
		String name = sc.next();
		System.out.println("welcome" + " " + name);
		
		
		int id = sc.nextInt();
		System.out.println("your id is" + " " + id);
		
	
		String city = sc.next();
		System.out.println("your city is" + " " + city);
		
		
		double salary = sc.nextDouble();
		System.out.println("your salary" + " " + salary);
		
		sc.close();
	}

}
