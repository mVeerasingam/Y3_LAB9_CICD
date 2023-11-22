package com.example.test2docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAppController {
    @GetMapping("/hello")
    public String message(){
        return "Hello World";
    }
}
