package com.app.microservice_eserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceEServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEServerApplication.class, args);
    }

}
