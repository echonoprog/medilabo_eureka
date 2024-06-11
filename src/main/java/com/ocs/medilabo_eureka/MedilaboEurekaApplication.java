package com.ocs.medilabo_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MedilaboEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedilaboEurekaApplication.class, args);
    }

}
