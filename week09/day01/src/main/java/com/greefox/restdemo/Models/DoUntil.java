package com.greefox.restdemo.Models;

public class DoUntil {
    String task;
    int until;
    int result;

    public DoUntil(String task, int until) {
        this.task = task;
        this.until = until;
        this.result = sum();
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < until; i++) {
        sum+=i;
        }
        return sum;
    }
    public int factor() {
        int sum = 0;
        for (int i = 0; i < until; i++) {
        sum*=i;
        }
        return sum;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setUntil(int until) {
        this.until = until;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getTask() {
        return task;
    }

    public int getUntil() {
        return until;
    }

    public int getResult() {
        if (this.task == "sum"){
            setResult(sum());
        } else if (this.task == "factor"){
            setResult(factor());
        }
        return result;
    }
}
