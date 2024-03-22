package com.voya.training;

public class Trenary {
public static void main(String[] args) {
//	cond ? excute true : excute false
	
	int x=10;
	int y=20;
	int z=30;
	
	String result = (x>y&&x>z)?"a is greater":(y>z)?"y is greater":"z is greater";
	System.out.println(result);
	
	int s = (x>y&&x>z)?x:(x>z)?y:z;
	System.out.println(s);
}
}
