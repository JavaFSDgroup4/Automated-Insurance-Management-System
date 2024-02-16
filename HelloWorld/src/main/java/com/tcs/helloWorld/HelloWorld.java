package com.tcs.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorld {

	@GetMapping("/go")
	public String hello() {
		return "Welcome JavaFSDgroup...";
	}
}
