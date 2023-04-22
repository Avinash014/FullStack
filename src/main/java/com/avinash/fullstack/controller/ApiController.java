package com.avinash.fullstack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/**")
public class ApiController {
    @GetMapping("/home")
    public String getHome(){
        return "Hello there";
    }

}
