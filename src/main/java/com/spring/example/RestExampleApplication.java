package com.spring.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.spring.example"})
@EnableAutoConfiguration
public class RestExampleApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestExampleApplication.class, args);
	}

}
