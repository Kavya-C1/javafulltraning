package com.example.javabased;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class IndianMenu implements IFoodMenu{

	@Override
	public List<String> showMenu() {
		// TODO Auto-generated method stub
		List<String> indianMenu = Arrays.asList("panipuri","samosa");
//		for(String food:indianMenu) {
//			System.out.println(food);
//		}
		return indianMenu;
	}

}
