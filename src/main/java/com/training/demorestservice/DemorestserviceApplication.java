package com.training.demorestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.training"})
// @EnableJpaRepositories(basePackages = "com.training.demorestservice.")
public class DemorestserviceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemorestserviceApplication.class, args);
	}
}
