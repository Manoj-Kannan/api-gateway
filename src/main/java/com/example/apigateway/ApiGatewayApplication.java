package com.example.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	/*
	Say, we have multiple MicroServices (iam service, service 1, service 2, service 3)
	To access any of the service, we need to succeed in iam authentication. (Since each service is hosted individually)
	To use service 1, we need to login with iam
	To use service 2, we need to login with iam

	To solve this, we can use a common api-gateway which shares common authentication for all services.
	 */
}
