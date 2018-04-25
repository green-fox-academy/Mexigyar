package com.greenfox.clothing.clothing.controllers;

import com.greenfox.clothing.clothing.models.Summary;
import com.greenfox.clothing.clothing.models.Warehouse;
import com.greenfox.clothing.clothing.repo.WarehouseRepo;
import com.greenfox.clothing.clothing.service.WarehouseService;
import com.greenfox.clothing.clothing.service.WarehouseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
    @Autowired
    WarehouseRepo warehouseRepo;

    @Autowired
    WarehouseServiceImpl warehouseServiceimpl;

    @GetMapping("/warehouse")
    public String index(Model model) {
        model.addAttribute("warehouse", warehouseRepo.findAll());
        model.addAttribute("itemNames", warehouseServiceimpl.getAvailableItemNames());
        model.addAttribute("itemSizes", warehouseServiceimpl.getAvailableItemSizes());
        return "index";
    }

    @PostMapping("/warehouse/summary")
    public String summary(@ModelAttribute Summary summary, Model model) {

        int amount = Integer.parseInt(summary.getNumberOfItems());
        Warehouse warehouse = new Warehouse();
        warehouse = warehouseRepo.findFirstByItemNameEquals(summary.getItem());
        model.addAttribute("item", warehouse);
        model.addAttribute("size",summary.getSize());
        model.addAttribute("amount",amount);
        float totalPrice = amount * warehouse.getUnitPrice();
        model.addAttribute("totalPrice",totalPrice);
        return "summary";
    }
}
