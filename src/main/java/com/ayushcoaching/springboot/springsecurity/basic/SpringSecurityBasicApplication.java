package com.ayushcoaching.springboot.springsecurity.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ayushcoaching.springboot.springsecurity.basic")
public class SpringSecurityBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityBasicApplication.class, args);

		System.out.println("My First Springboot Security Basic Application");
	}

}
