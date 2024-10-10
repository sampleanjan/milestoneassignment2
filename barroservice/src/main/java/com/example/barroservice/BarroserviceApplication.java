package com.example.barroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BarroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarroserviceApplication.class, args);
	}

}
