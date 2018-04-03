package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        AtomicLong atomicLong = new AtomicLong(0);
        model.addAttribute("name", " World");
        model.addAttribute("count", atomicLong.addAndGet(1));

        return "greeting";
    }
}
