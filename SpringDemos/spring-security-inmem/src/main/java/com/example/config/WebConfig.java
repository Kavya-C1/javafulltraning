package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebConfig {
//localhost:8081/api/greet
	//localhost:8081/api/user/book/show
	//localhost:8081/api/admin/books/in
	//localhost:8081/logout
	//two beans
		//authentication using inmemory authentication
	@Bean
	public UserDetailsManager userDetailsManager() {
		UserDetails user1 =
				User.withUsername("Kavya")
					.password(encoder().encode("kav12"))
				    .roles("ADMIN", "USER")
				    .build();
		
		UserDetails user2 = User.withUsername("chandru")
				.password(encoder().encode("chan123"))
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(user1, user2);
	}
	




	
	private Object Encoder() {
		return new BCryptPasswordEncoder();
	}
	
@Bean	
public PasswordEncoder encoder() {
	return new BCryptPasswordEncoder();
}
	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception {
		return http
				.csrf(csrf -> csrf.disable())
				.authorizeHttpRequests((auth) -> auth
						.requestMatchers("/api/user/**").hasAnyRole("USER","ADMIN")
						.requestMatchers("/api/admin/**").hasRole("ADMIN")
						.anyRequest().authenticated()
	)
				.sessionManagement(sess ->sess.sessionCreationPolicy(
						SessionCreationPolicy.STATELESS))
.httpBasic(Customizer.withDefaults())
.build();
	}
}
