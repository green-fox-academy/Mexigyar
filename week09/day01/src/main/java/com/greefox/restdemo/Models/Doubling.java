package com.greefox.restdemo.Models;

public class Doubling {
    int input;
    int result;

    public Doubling(int input) {
        this.input = input;
        this.result = input * 2;
    }

    public int getInput() {
        return input;
    }

    public int getResult() {
        return result;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "{\n" +
                input + ": 15,\n" +
                result + ": 30\n" +
                "}";
    }
}
