package com.infinx;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "greet-api")
public interface GreetAPI {
	
	@GetMapping("/greet")
	public String greetApi();

}
