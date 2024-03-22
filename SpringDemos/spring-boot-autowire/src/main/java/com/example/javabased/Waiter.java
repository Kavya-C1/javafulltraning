package com.example.javabased;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Waiter {
//	@Autowired
//	@Qualifier("chinese")
//	IFoodMenu chineseMenu;
//	
//	@Autowired
//	@Qualifier("italian")
//	IFoodMenu italianMenu;
//	
	
	
	@Autowired
	@Qualifier("getIndian")
	IFoodMenu iFoodMenu;
	
	@Autowired
	IFoodMenu menus;
	
	
	IFoodMenu menuItems;



	public void setMenuItems(IFoodMenu menuItems) {
		this.menuItems = menuItems;
	}


	public List<String> viewMenuCard(String choice){
		List<String> menuList = new ArrayList<>();
		if(choice.equals("indian")) {
			menuList=iFoodMenu.showMenu();
		}
		if(choice.equals("italian")) {
			menuList=iFoodMenu.showMenu();
		}
		if(choice.equals("chinese")) {
			menuList=iFoodMenu.showMenu();
		}
		
		return  menuList;
	}
	
//	List<String> viewMenuCard(String choice) {
//		if(choice.equals("indian")) {
//			indianMenu.showMenu();
//		}
//		if(choice.equals("italian")) {
//			italianMenu.showMenu();
//		}
//		if(choice.equals("chinese")) {
//			chineseMenu.showMenu();
//		}
//		
//		return null;
//	}

}
