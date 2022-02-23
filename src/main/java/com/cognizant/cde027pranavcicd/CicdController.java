package com.cognizant.cde027pranavcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdController {

	@GetMapping("/")
	public String hello() {
		return "Hello";
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to CI-CD pipeline by Pranav";
	}

	@GetMapping("/welcome/{name}")
	public String welcomeUser(@PathVariable("name") String name) {
		return "Welcome " + name;
	}
}
