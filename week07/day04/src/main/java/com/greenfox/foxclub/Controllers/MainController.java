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
    public String index2(@RequestParam(name = "foxname", required = false) String name, Model model){
        model.addAttribute("foxname",name);
        return "index";
    }

    @GetMapping(value = "/login")
    public String login(){
        return  "login";
    }

    @PostMapping(value = "/login")
    public String login2(@ModelAttribute(name = "foxname") String foxname){
        fox.setName(foxname);
        return "redirect:/?foxname=" + foxname;
    }

}
