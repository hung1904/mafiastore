package com.h2.mafia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class MafiaStoreApplication extends SpringBootServletInitializer implements WebApplicationInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(MafiaStoreApplication.class, args);
	}

}
