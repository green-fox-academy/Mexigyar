package com.greefox.restdemo.Models;

public class Doubling {
    int result;


    public Doubling(int input) {
        this.result = input * 2;
    }

    public int getInput() {
        return result;
    }


    public void setInput(int input) {
        this.result = input;
    }
}
