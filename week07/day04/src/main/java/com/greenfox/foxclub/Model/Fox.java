package com.greenfox.foxclub.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Fox {
    String name;
    String color;

    public Fox(String name, String color) {
        this.name = name;
        this.color = color;
    }
    @Autowired
    public Fox() {
        this.color = "green";
        this.name = "basic fox";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
