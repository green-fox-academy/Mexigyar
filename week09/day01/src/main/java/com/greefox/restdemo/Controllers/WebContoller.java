package com.greefox.restdemo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebContoller {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
