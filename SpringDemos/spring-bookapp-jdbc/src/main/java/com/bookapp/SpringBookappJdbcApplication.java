package com.bookapp;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappJdbcApplication.class, args);
	}

	@Autowired
	IBookService bookService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		List<Book> books = bookService.getAll();
		for(Book book:books) {
			System.out.println(book);
		}
		
	}
	
	
	
}
