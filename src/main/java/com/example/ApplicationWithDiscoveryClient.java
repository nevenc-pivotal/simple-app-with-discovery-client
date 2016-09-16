package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationWithDiscoveryClient {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationWithDiscoveryClient.class, args);
	}
}

@RestController
class HomeController {
	@RequestMapping("/")
	public String hello() {
		return "Hello World!";
	}
}
