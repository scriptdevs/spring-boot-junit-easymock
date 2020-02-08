package com.apps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.apps.service.MainService;

@Controller
public class MainController {

    @Autowired
    MainService mainService;
    
    /*
     * Returns a simple message
     */
    @GetMapping("/")
    public String getPage() {
        return "index";
    }

}
