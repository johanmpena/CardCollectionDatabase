package com.CardCollectionDatabase.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SetController {

    @GetMapping("/sets")
    public String getSetPage(){
        return "set.html";
    }
}
