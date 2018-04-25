package com.greenfox.clothing.clothing.models;


import java.util.ArrayList;
import java.util.List;

public class JsonHouses {

   private String result;
  private   ArrayList<Warehouse> clothes;

    public JsonHouses() {
        this.result = "ok";
    }

    public JsonHouses(ArrayList<Warehouse> clothes) {
        this.result = "ok";
        this.clothes = clothes;
    }

    public String getResult() {
        return result;
    }

    public ArrayList<Warehouse> getClothes() {
        return clothes;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setClothes(ArrayList<Warehouse> clothes) {
        this.clothes = clothes;
    }
}