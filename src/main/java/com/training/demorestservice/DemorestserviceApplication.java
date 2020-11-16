package com.training.demorestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.training"})
public class DemorestserviceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemorestserviceApplication.class, args);
	}
}
