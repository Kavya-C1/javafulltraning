package com.example.javabased;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class ItalianMenu implements IFoodMenu{

	@Override
	public List<String> showMenu() {
		// TODO Auto-generated method stub
		List<String> italianMenu = Arrays.asList("pizza","pasta");
//		for(String food:italianMenu) {
//			System.out.println(food);
//		}
		return italianMenu;
	}

}
