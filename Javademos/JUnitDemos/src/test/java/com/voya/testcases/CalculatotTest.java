package com.voya.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.traning.Calculator;

public class CalculatotTest {
	Calculator calculator = null;

	@BeforeAll
	static void init() throws Exception {
		System.out.println("called before all the testcases");
	}

	@AfterAll
	static void cleanUp() throws Exception {
		System.out.println("called after all the testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
		System.out.println("called before each test case");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
		System.out.println("called after each test case");
	}

	@Test
//	@DisplayName("Testing sum method");
	void testSum() {
		int actual = calculator.sum(10, 20);
		Assertions.assertEquals(30,actual,"output should be 30");
		
//		fail("Not yet implemented"); // TODO
	}
	
	@Test
	void testProduct() {
		int actual = calculator.product(5, 4);
		Assertions.assertEquals(20,actual,"output should be 30");
	}
	
//	@Test
//	void testgreetMessage() {
//		String actual = calculator.greetMessage("kavya");
//		Assertions.assertEquals("kavya",actual,"output should be kavya");
//	}
	
	@Test
	@DisplayName("Testing greet method")
	void testGreet() {
		String username = "Kavya";
		String actual = calculator.greetMessage(username);
		assertEquals("Welcome Kavya",actual,"not a match ");
	}
//
//	@Test
//	@DisplayName("Testing show method")
//	void testShowCourses() {
//		List<String> expected = Arrays.asList("Angular","CSS","Html","Java","Spring");
//		List<String> actual = calculator.showCourses();
//		assertEquals(expected,actual);
//		}
	

	@Test
	@Tag("first")
	@DisplayName("Testing show method")
	void testShowCourses() {
		List<String> coursesInput = Arrays.asList("Angular","Html","CSS","Spring","Java");
		List<String> expected = Arrays.asList("Angular","CSS","Html","Java","Spring");
		List<String> actual = calculator.showCourses(coursesInput);
		Collections.sort(coursesInput);
		assertEquals(expected,actual);
		}
	
}
