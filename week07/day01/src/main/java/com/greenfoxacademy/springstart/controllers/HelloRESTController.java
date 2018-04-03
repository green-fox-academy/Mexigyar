package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event;


@RestController

public class HelloRESTController {

    @RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam("name")String content){
        Greeting greeting = new Greeting(1,"hello " + content);
        return greeting;
    }
}
