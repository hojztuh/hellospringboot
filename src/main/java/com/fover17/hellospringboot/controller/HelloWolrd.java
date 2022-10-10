package com.fover17.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello")

public class HelloWolrd {
    @RequestMapping("/helloworld")
    public String helloworld() {
        return "hello world!";
    }
}
