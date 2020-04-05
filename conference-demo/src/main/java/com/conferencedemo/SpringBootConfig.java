package com.conferencedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan
@EnableMongoRepositories("com.conferencedemo.repository")
public class SpringBootConfig {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfig.class, args);
	}

}
