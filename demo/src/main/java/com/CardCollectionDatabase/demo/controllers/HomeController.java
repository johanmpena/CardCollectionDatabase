package com.CardCollectionDatabase.demo.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class HomeController {

    @GetMapping("/")
    public String getHomePage(){
        return "home.html";
    }
}
