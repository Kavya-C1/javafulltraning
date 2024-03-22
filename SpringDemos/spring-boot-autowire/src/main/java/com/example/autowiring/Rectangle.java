package com.example.autowiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rectangle implements IShape {

	@Override
	public void area(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Rectangle area:" + (2*x+2*y));
	}

}
