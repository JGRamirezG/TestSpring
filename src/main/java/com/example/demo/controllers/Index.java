package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class Index {
    @GetMapping("/test/{name}")
    public String test(@PathVariable("name") String name){
        return "HOLA TU: " + name + "UWU";
    }
}
