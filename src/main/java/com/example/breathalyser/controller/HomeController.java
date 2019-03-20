package com.example.breathalyser.controller;

import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/")
public class HomeController {
    public String homeController() {
        return "index";
    }
}
