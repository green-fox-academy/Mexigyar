package com.greenfox.foxclub.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Fox {
    String name;
    String color;
    String food;
    String drink;

    public Fox(String name, String color) {
        this.name = name;
        this.color = color;
    }



    @Autowired

    public Fox() {
        this.name = "okazaki";
        this.color = "yellow";
        this.food = "sushi";
        this.drink = "water";
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

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }
}
