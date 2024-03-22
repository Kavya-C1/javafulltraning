package com.example.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	
	@Bean
	public ChineseMenu getChinese() {
		return new ChineseMenu();
	}

	@Bean
	public IndianMenu getIndian() {
		return new IndianMenu();
	}

	@Bean
	@Primary
	public ItalianMenu getItalian() {
		return new ItalianMenu();
	}
	
	@Bean
	public  Waiter getWaiter() {
		Waiter waiter = new Waiter();
		waiter.setMenuItems(getChinese());
		return waiter;
	}

}
