package com.greenfoxacademy.spring2.spring2.controller;

import com.greenfoxacademy.spring2.spring2.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {

    @RequestMapping(value = "/show")
    public String show(){

        String accountData = new BankAccount("Simba", 2000, "lion", "zebra").toString();
        return  accountData;
    }
}
