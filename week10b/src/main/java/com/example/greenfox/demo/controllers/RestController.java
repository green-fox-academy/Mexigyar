package com.example.greenfox.demo.controllers;

import com.example.greenfox.demo.models.JsonResult;
import com.example.greenfox.demo.repo.TicketsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    TicketsRepo ticketsRepo;

    @GetMapping("/list/query")
    public JsonResult query(@RequestParam("manufacturer") String manufacturer){
        return new JsonResult(ticketsRepo.findAllByManufacturerEquals(manufacturer));
    }
}
