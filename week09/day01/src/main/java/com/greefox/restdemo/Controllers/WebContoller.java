package com.greefox.restdemo.Controllers;

import com.greefox.restdemo.Models.Doubling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebContoller {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }



}


