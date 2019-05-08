package com.zequs.learn.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloundEurekaServerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloundEurekaServerDemoApplication.class, args);
    }

}
