package com.greenfoxacademy.spring2.spring2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContentController {

    @RequestMapping(value = "/content")
    public String showSomeHTML(Model model){
        model.addAttribute("content", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "htmlcontent";
    }
}
