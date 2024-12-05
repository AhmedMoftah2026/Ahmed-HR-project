package com.ahmed.hr;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HrApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/hr");
		SpringApplication.run(HrApplication.class, args);
	}

}
