package com.greenfox.clothing.clothing.controllers;

import com.greenfox.clothing.clothing.repo.WarehouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @Autowired
    WarehouseRepo warehouseRepo;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("warehouse", warehouseRepo.findAll());
        return "index";
    }
}
