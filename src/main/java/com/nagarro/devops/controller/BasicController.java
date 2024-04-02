package com.nagarro.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    
    @GetMapping("/")
    public String home(){
        return "Basic Devops application";
    }

    @GetMapping("/run")
    public String run(){
        return "Devops App is running";
    }
}
