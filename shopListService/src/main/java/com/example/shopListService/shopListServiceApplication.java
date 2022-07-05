package com.example.shopListService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class shopListServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(shopListServiceApplication.class, args);
	}

}
