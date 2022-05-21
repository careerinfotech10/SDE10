package com.infinx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GreetApiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetApiClientApplication.class, args);
	}

}
