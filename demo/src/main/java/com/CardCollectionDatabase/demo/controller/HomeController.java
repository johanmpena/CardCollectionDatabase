package com.CardCollectionDatabase.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getIndexPage(){
        return "home.html";
    }

    @GetMapping("/home")
    public String getHomePage(){
        return "home.html";
    }
}
