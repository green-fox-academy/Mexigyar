package com.greefox.restdemo.Models;

public class Doubling {
    Integer received;
    Integer result;


    public Doubling(int input) {
        this.received = input;
        this.result = input * 2;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getReceived() {
        return received;
    }

    public Integer getResult() {
        return result;
    }
}
