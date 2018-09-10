package com.study.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradlePjApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradlePjApplication.class, args);
		System.out.println("Hello Gradle");
	}
}
