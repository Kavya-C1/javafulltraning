package com.example.javabased;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class ChineseMenu implements IFoodMenu {

	@Override
	public List<String> showMenu() {
		// TODO Auto-generated method stub
//		List<String> chineseMenu = Arrays.asList("gobi","noodles");
//		for(String food:chineseMenu) {
//			System.out.println(food);
//		}
		return Arrays.asList("gobi","noodles");
	}

}
