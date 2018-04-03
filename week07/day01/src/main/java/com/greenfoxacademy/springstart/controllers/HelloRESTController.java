package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


@RestController

public class HelloRESTController {
    AtomicLong atomicLong = new AtomicLong(1);

    @RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam("name")String content){
        Greeting greeting = new Greeting(atomicLong.addAndGet(1),"hello " + content);
        return greeting;
    }

}
