package com.student.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.exception.InvalidNumException;
import com.voya.traning.StudentDetails;

class StudentDetailsTest {
	
	StudentDetails studentDetails = null;

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
		studentDetails = new StudentDetails();
		System.out.println("called before each test case");
	}

	@AfterEach
	void tearDown() throws Exception {
		studentDetails = null;
		System.out.println("called after each test case");
	}

//	@Test
//	final void testTotalMarks() {
//		int actual = studentDetails.totalMarks(10,20,30);
//		Assertions.assertEquals(60,actual,"output should be 60 ");
//		
////		fail("Not yet implemented"); // TODO
//	}
	
	
	@Test

	void testTotalMarks() {
		assertEquals(250,studentDetails.totalMarks(90, 80, 80),"not correct");
	}
	
	@Test
	@Tag("negative")
	@DisplayName("Testing negative marks")
	void testNegMarks() {
		assertThrows(InvalidNumException.class,()->studentDetails.totalMarks(90, 120, 60));
	}
	
	@Test
	@Tag("negative")
	@DisplayName("Testing positive marks")
	void testPosMarks() {
		assertThrows(InvalidNumException.class,()->studentDetails.totalMarks(90, -20, 60));
	}
	
	

}
