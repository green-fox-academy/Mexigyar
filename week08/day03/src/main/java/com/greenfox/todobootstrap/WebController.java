package com.greenfox.todobootstrap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/todo")
public class WebController {


    @GetMapping(value = "/test2")
    public String add(Model model) {
        return "test2";
    }



    @GetMapping(value = "/test")
    public String add2(Model model) {
        return "test";
    }
}
