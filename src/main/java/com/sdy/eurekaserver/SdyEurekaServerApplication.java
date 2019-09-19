package com.sdy.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SdyEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SdyEurekaServerApplication.class, args);
    }

}
