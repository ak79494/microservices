package com.example.repositoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RepositoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepositoryServiceApplication.class, args);
	}

}
