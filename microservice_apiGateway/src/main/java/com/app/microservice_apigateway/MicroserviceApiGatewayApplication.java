package com.app.microservice_apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceApiGatewayApplication.class, args);
    }



}