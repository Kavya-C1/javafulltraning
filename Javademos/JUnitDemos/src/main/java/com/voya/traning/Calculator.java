package com.voya.traning;

import java.util.Arrays;
import java.util.List;

public class Calculator {
	 public int sum(int x, int y){
	        return x+y;
	    }
	 
	 public int product(int x, int y){
	        return x*y;
	    }
	 
	 public String greetMessage(String message) {
//		 return message;
		 return "Welcome "+message;
	 }
	 
//	 public List<String> showCourses(){
//		 return Arrays.asList("Java","Spring","Angular");
//	 }
//	 
	 public List<String> showCourses(List<String> courses){
		 return courses;
	 }

	 
}
