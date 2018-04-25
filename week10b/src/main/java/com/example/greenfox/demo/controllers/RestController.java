package com.example.greenfox.demo.controllers;

import com.example.greenfox.demo.models.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/list/query")
    public JsonResult query(){
        return new JsonResult();
    }
}
