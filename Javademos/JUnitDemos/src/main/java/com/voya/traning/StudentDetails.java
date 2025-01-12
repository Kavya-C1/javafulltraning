package com.voya.traning;

import com.voya.exception.InvalidNumException;

public class StudentDetails {

	public int totalMarks(int marks1, int marks2, int marks3) throws InvalidNumException {
		
		if(marks1<0 || marks2<0 || marks3<0) {
			throw new InvalidNumException("No Negative values");
		}
		if(marks1>100 || marks2>100 || marks3>100)
			throw new InvalidNumException("Values should be greater than 100");
		
		int sum = marks1+marks2+marks3;
		return sum;
	}
	
}
