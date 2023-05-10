package com.java.JavaTestingEx.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class GetController {

    public String hello(String name){
        return String.format("Hello, %s", name);
    }

    @GetMapping("/hello1")
    public String helloController(@RequestParam(name = "name", defaultValue = "World") String name){
        return String.format("Hello, %s", name);
    }

    @GetMapping("/request")
    public String getRequest(@RequestParam Optional<String> id){
        return "ID: " + id.orElseGet(()-> "not provided");
    }
}
