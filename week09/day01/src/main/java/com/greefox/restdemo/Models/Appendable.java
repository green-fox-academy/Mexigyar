package com.greefox.restdemo.Models;

public class Appendable {
    String appendable;

    public Appendable(String appendable) {
        this.appendable = appendable + "a";
    }

    public String getAppendable() {
        return appendable;
    }

    public void setAppendable(String appendable) {
        this.appendable = appendable;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"appended\": \" "+ appendable +" \"\n" +
                "}";
    }
}
