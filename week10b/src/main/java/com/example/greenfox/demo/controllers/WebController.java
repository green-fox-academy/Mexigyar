package com.example.greenfox.demo.controllers;

import com.example.greenfox.demo.repo.TicketsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @Autowired
    TicketsRepo ticketsRepo;

    @RequestMapping("/")
    public String index() {

        return "index";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("tickets",ticketsRepo.findAll());
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
