package com.compasso.states.states.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/api/states")
public class HelloController {

	@GetMapping
	public String helloWorld()
	{
		return "Hello World";
	}
}
