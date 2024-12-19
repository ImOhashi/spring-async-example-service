package com.ohashi.spring_async_example_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class SpringAsyncExampleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAsyncExampleServiceApplication.class, args);
	}

}
