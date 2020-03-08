package com.mycompany.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    public CustomerController() {

    }

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
