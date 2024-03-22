package com.voya.training;

import java.util.*;
public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] username = {"kavya","pooja","chandru"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name to register");
		String user = sc.next();
		
		for(int i=0; i<username.length; i++) {
		if(username[i].equals(user))
		{
			System.out.println("Name is not unique, already exits");
			break;
		}
		else
		{
			System.out.println("Your name is now are registered");
			break;
		}
	}
		sc.close();
	}
}
