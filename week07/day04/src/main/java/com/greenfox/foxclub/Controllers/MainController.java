package com.greenfox.foxclub.Controllers;

import com.greenfox.foxclub.Model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    Fox fox;

    @RequestMapping(value = "/")
    public String index(){

        return "index";
    }

    @RequestMapping(value = "/")
    public String index2(@RequestParam("name") String name){
        fox.setName(name);
        System.out.println(fox);
        return "index";
    }

    @GetMapping(value = "/login")
    public String login(){
        return  "login";
    }

    @PostMapping(value = "/login")
    public String login2(){
        return "redirect:/";
    }
}
