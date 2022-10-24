package com.erainfotechbd.cicd.cicddemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping("")
    public String getWelcomeMessage(){
        return "Hi form CiCd Demo Project";
    }
}
