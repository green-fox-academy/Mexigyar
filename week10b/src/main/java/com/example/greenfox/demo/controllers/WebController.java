package com.example.greenfox.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/list")
    public String list() {
        return "list";
    }

    @PostMapping("/report")
    public String report() {
        return "";
    }

    @PostMapping("/complete/{id}")
    public String complete() {
        return "";
    }



}
