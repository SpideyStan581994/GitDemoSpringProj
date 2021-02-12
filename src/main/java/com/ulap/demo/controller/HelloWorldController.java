package com.ulap.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping("/greeting")
    public String sayHello(@RequestParam(value = "name", defaultValue = "hello") String name){
        return "Hello " + name;
    }

    @GetMapping("/view")
    public PersonModel viewUser(){
        return new PersonModel(1,"Steven Tan",26);
    }

    
}
