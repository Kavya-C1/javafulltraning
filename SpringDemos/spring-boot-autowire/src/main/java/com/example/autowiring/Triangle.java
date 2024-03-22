package com.example.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements IShape {

	@Override
	public void area(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("triangle area:" + (x+y));
		
	}

}
