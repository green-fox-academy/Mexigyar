package com.greefox.restdemo.Models;

public class Greater {
    public String name;
    public String title;

    public Greater(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"welcome_message\": \"Oh, hi there " + name + ", my dear "+ title +"!\"\n" +
                "}";
    }
}
