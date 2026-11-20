package com.example.isaacapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j2;

@Log4j2 
@SpringBootApplication
public class IsaacappApplication {

	public static void main(String[] args) {
		SpringApplication.run(IsaacappApplication.class, args);
		log.info("Application started with arguments: {}", (Object[]) args);
	}

}
