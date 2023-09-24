package com.example.douglas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DouglasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DouglasApplication.class, args);
	}

}