package com.zequs.learn.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.zequs.learn.controller")
public class SpringCloudEurekaClientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaClientDemoApplication.class, args);
    }
}
