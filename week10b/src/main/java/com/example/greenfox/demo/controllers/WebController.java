package com.example.greenfox.demo.controllers;

import com.example.greenfox.demo.models.Tickets;
import com.example.greenfox.demo.repo.TicketsRepo;
import com.example.greenfox.demo.repo.UsersRepo;
import com.example.greenfox.demo.service.TicketsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;

@Controller
public class WebController {

    @Autowired
    TicketsRepo ticketsRepo;

    @Autowired
    UsersRepo usersRepo;

    @Autowired
    TicketsService ticketsService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("users", usersRepo.findAll());
        model.addAttribute("newTicket",new Tickets());
        return "form";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("tickets",ticketsRepo.findAll());
        return "list";
    }

    @PostMapping("/report")
    public String report(@ModelAttribute Tickets tickets) {
        tickets.setReportedAt(ticketsService.getCuurentTime());
        ticketsRepo.save(tickets);
        return "redirect:/list";
    }

    @PostMapping("/complete/{id}")
    public String complete(@PathVariable(value = "id") Integer id) {
        //ticketsRepo.deleteById(id);
        return "redirect:/";
    }



}
