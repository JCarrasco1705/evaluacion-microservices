package com.example.adminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServergataweyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServergataweyApplication.class, args);
	}

}
