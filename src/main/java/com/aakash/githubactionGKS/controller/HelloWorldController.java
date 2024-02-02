package com.aakash.githubactionGKS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("hello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hi "+name+" how are you ";
    }
}
