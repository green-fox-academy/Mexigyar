package com.greenfoxacademy.springstart.controllers;

public class Greeting {
    long ID;
    String content;

    public Greeting(long ID, String content) {
        this.ID = ID;
        this.content = content;
    }

    public long getID() {
        return ID;
    }

    public String getContent() {
        return content;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "ID=" + ID +
                ", content='" + content + '\'' +
                '}';
    }
}
