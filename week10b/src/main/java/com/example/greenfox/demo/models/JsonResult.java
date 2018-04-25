package com.example.greenfox.demo.models;

import java.util.List;

public class JsonResult {
    String result;
    List<Tickets> tickets;

    public JsonResult(List<Tickets> tickets) {
        this.result = "ok";
        this.tickets = tickets;
    }

    public JsonResult() {
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setTickets(List<Tickets> tickets) {
        this.tickets = tickets;
    }

    public String getResult() {
        return result;
    }

    public List<Tickets> getTickets() {
        return tickets;
    }
}
