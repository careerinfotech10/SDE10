package com.infinx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@Autowired
	private GreetAPI greetClient;

	@GetMapping("/welcome")
	public String welcome() {
		return greetClient.greetApi();
	}

}
