package com.greenfox.resttest.Model;

public class Clothes {

    private int id;
    private String item_name;
    private String manufacturer;
    private String category;
    private String size;
    private int unit_price;

    public Clothes(int id, String item_name, String manufacturer, String category, String size, int unit_price) {
        this.id = id;
        this.item_name = item_name;
        this.manufacturer = manufacturer;
        this.category = category;
        this.size = size;
        this.unit_price = unit_price;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setUnit_price(int unit_price) {
        this.unit_price = unit_price;
    }

    public int getId() {
        return id;
    }

    public String getItem_name() {
        return item_name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public String getSize() {
        return size;
    }

    public int getUnit_price() {
        return unit_price;
    }
}
