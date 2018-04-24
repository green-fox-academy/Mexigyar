package com.greenfox.clothing.clothing.models;

import com.sun.tools.javac.util.List;

public class JsonHouses {

    String result;
    List<Warehouse> clothes;

    public JsonHouses() {
    }

    public JsonHouses(List<Warehouse> clothes) {
        this.result = "ok";
        this.clothes = clothes;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setClothes(List<Warehouse> clothes) {
        this.clothes = clothes;
    }

    public String getResult() {
        return result;
    }

    public List<Warehouse> getClothes() {
        return clothes;
    }
}
