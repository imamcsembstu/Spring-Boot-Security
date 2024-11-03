package com.springboot.securitydemo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingTestController {

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String userEndpoint(){
        return "Hello, User!";
    }

    @GetMapping("/admin")
    public String adminEndpoint(){
        return "Hello, Admin!";
    }

}