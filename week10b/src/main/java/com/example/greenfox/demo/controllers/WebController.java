package com.example.greenfox.demo.controllers;

import com.example.greenfox.demo.models.Tickets;
import com.example.greenfox.demo.repo.TicketsRepo;
import com.example.greenfox.demo.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

@Controller
public class WebController {

    @Autowired
    TicketsRepo ticketsRepo;

    @Autowired
    UsersRepo usersRepo;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("users", usersRepo.findAll());

        return "form";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("tickets",ticketsRepo.findAll());
        return "list";
    }

    @PostMapping("/report")
    public String report(@ModelAttribute Tickets tickets) {
        ticketsRepo.save(tickets);
        return "redirect:/list";
    }

    @PostMapping("/complete/{id}")
    public String complete() {
        return "redirect:/";
    }



}
