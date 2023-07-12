package com.teamtwo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages ="com.roda")
public class SuperHeroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperHeroApplication.class, args);
	}

}
