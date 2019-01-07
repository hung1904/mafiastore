package com.h2.mafia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
@ComponentScan
@EntityScan
@EnableJpaRepositories
public class MafiaStoreApplication extends SpringBootServletInitializer implements WebApplicationInitializer {
	 	
	public static void main(String[] args) {
		SpringApplication.run(MafiaStoreApplication.class, args);
	}

}
