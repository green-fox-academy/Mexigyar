package com.greenfox.expractice.controller;

import com.greenfox.expractice.repo.LicenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @Autowired
    LicenceRepo licenceRepo;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("plates", licenceRepo.findAll());
        return "index";
    }

    @RequestMapping("/search")
    public String search(String q,@RequestParam(value = "police", required = false) String police, @RequestParam(value = "diplomat", required = false) String diplomat, Model model) {
        if (q != null){
            model.addAttribute("plates", licenceRepo.findAllByPlateContains(q));
            return "index";
        }
        if (police != null) {
            model.addAttribute("plates", licenceRepo.findAllByPlateStartsWith("RB"));
            return "index";
        }
        if (diplomat != null){
            model.addAttribute("plates", licenceRepo.findAllByPlateStartsWith("DT"));
            return "index";
        }
        model.addAttribute("plates", licenceRepo.findAll());
        return "index";

        //return "redirect:/";
    }


    @GetMapping("/search/{brand}")
    public String searchBrand(@PathVariable(name = "brand") String brand,Model model) {
        model.addAttribute("plates", licenceRepo.findAllByCarBrandEquals(brand));
        return "index";
    }

}
