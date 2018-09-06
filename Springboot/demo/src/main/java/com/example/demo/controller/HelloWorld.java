package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorld {

	@RequestMapping("/")
	private String hello() {
		return "HelloWorld Spring boot!";
	}
}
