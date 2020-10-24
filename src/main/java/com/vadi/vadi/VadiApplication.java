package com.vadi.vadi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class VadiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VadiApplication.class, args);
	}

}
