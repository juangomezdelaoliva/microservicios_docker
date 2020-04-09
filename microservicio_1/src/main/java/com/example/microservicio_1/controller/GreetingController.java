package com.example.microservicio_1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservicio_1.util.Greeting;

@RestController

public class GreetingController {

	private static final String template = "Hello, %s!";

	@RequestMapping("/saludo/{name}")
	public Greeting greeting(@PathVariable("name") String name) {
		return new Greeting(String.format(template, name));
	}

	@RequestMapping("/saludo")
	public String greeting() {
		return "hello juan";
	}

}