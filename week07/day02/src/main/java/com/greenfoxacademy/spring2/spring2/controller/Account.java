package com.greenfoxacademy.spring2.spring2.controller;


import com.greenfoxacademy.spring2.spring2.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;


@Controller
public class Account {

    @RequestMapping(value = "/account")
    public String Account(Model model){
        ArrayList<BankAccount> accounts = fillWithAccounts();
        model.addAttribute("accounts", accounts);
        return "accounts";
    }

    public ArrayList<BankAccount> fillWithAccounts() {
        ArrayList<BankAccount> accountList = new ArrayList<>();
        accountList.add(new BankAccount("Striped Cat", 0, "Tiger", "Zebra"));
        accountList.add(new BankAccount("Big Eagle", 5, "Eagle", "Cancer"));
        accountList.add(new BankAccount("Slow mo", 10, "Turtle", "Fish"));
        accountList.add(new BankAccount("Striped Horse", 20, "Zebra", "Insect"));
        accountList.add(new BankAccount("Blackie", 1, "Panther", "Elephant"));
        return accountList;
    }
}
