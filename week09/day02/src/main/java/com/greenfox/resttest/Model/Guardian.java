package com.greenfox.resttest.Model;

public class Guardian {

    String recieved;
    String translated;

    public Guardian() {
    }

    public Guardian(String recieved) {
        this.recieved = recieved;
        this.translated = "I am Groot";
    }

    public String getRecieved() {
        return recieved;
    }

    public String getTranslated() {
        return translated;
    }

    public void setRecieved(String recieved) {
        this.recieved = recieved;
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }
}
