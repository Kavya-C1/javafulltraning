package com.voya.training;

import java.util.Scanner;

public class Registration2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] usernames = { "kavya", "pooja", "chandru" };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name to register");
		boolean isPresent = false;
		String uname = sc.next();
		
		for(String username: usernames) {
			if(username.equalsIgnoreCase(uname))
			{
			System.out.println("Name already exists");
			isPresent = true;
			break;
		}
	}
		if(!isPresent)
			System.out.println("You are registered");
}
}