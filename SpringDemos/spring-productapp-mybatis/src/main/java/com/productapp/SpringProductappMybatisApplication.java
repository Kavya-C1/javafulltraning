package com.productapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.productapp.model.Product;
import com.productapp.service.IProductService;

@SpringBootApplication
public class SpringProductappMybatisApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringProductappMybatisApplication.class, args);
	}
	
	@Autowired
	IProductService productService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Product> products = productService.getAll();
		for(Product product:products) {
			System.out.println(product);
		}
	}

}
