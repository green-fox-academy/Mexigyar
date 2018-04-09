package com.greenfox.foxclub.Controllers;

import com.greenfox.foxclub.Model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @Autowired
    Fox fox;


    @GetMapping(value = "/")
    public String index2(@RequestParam(name = "foxname", required = false) String name, @RequestParam(name = "food", required = false) String food, @RequestParam(name = "drink", required = false) String drink, Model model) {
        if (name == null) {
            model.addAttribute("foxname", fox.getName());
        } else {
            model.addAttribute("foxname", name);
        }
        if (food == null) {
            model.addAttribute("food", fox.getFood());
        } else {
            model.addAttribute("food", food);
        }
        if (drink == null) {
            model.addAttribute("drink", fox.getDrink());
        } else {
            model.addAttribute("drink", drink);
        }
        return "index";
    }


    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String login2(@ModelAttribute(name = "foxname") String foxname) {
        fox.setName(foxname);
        return "redirect:/?foxname=" + foxname;
    }


    @GetMapping(value = "/nutrition_store")
    public String nutStore() {
        return "nutritionstore";
    }

    @PostMapping()
    public String nutStore2(@ModelAttribute(name = "food") String food, @ModelAttribute(name = "drink") String drink) {
        return "redirect:/?food=" + food + "&" + "?drink=" + drink;
    }
}
