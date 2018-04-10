package com.greenfox.sqldemo;

import javax.persistence.Entity;


public class Todo {
    private long id;
    private  String title;
    private  boolean urgent;
    private  boolean done;


    public Todo() {
    }

    public Todo(long id, String title) {
        this.id = id;
        this.title = title;
        this.urgent = false;
        this.done = false;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public boolean isDone() {
        return done;
    }
}
