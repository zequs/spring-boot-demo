package com.zequs.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zequs
 * @version $Id: spring-cloud-eureka-client-demo, v0.1 2019 05 08 Exp $
 */
@RestController
public class UserController {
    AtomicInteger userId = new AtomicInteger();

    @GetMapping("/getUser")
    public String getUser() {
        String s = "id:" + userId.getAndIncrement() + "; name:张三";
        return s;
    }
}
