package com.hello.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.hello.demo.db.*","com.hello.demo.repository.*","com.hello.demo.services.*"})
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = {"com.hello.demo.repository.*"})
@EntityScan("com.hello.demo.db")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("<=======================================>");
		System.out.println("\s\s\s\s\s\s\s\s\s\s\s\s\sRUNING");
		System.out.println("<=======================================>");
	}
}