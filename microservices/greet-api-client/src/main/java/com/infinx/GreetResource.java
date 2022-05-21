package com.infinx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetResource {

	@GetMapping("/greet")
	public String greet() {

		return "Welcome to Greet API";
	}

}
