package com.java.JavaTestingEx.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @GetMapping("/getResult")
    public String getResult(@RequestParam(name = "name", defaultValue = "World") String name){
        return String.format("Hello, %s", name);
    }
}
