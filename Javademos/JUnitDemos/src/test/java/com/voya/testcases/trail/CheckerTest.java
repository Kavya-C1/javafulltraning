package com.voya.testcases.trail;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;



class CheckerTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test 
	@Tag("first")
	@DisplayName("Testing Null")
	void testNull() {
		List<String> mylist = null;
		assertNull(mylist);
	}
	
	@Test
	@DisplayName("Testing Not Null")
	void testNotNull() {
		List<String> mylist = new ArrayList<>();
		assertNotNull(mylist);
	}
	
	@Test
	@Tag("simple")
	@DisplayName("Testing String references")
	void testSame() {
		String username = "Priya";
		String nusername = "Priya";
		assertSame(username,nusername,"references are not same");
	}
	
	

}
