package com.sirionlabs.environment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.sirionlabs.environment.controllers")
public class SirionenvironmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SirionenvironmentApplication.class, args);
	}

}
