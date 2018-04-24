package com.greenfox.clothing.clothing.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Warehouse {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Integer id;
    String itemName;
    String manufacturer;
    String category;
    String size;
    float unitPrice;
    int inStore;


    public Warehouse() {
    }

    public Warehouse(String itemName, String manufacturer, String category, String size, float unitPrice, int inStore) {
        this.itemName = itemName;
        this.manufacturer = manufacturer;
        this.category = category;
        this.size = size;
        this.unitPrice = unitPrice;
        this.inStore = inStore;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setInStore(int inStore) {
        this.inStore = inStore;
    }

    public Integer getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
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

    public float getUnitPrice() {
        return unitPrice;
    }

    public int getInStore() {
        return inStore;
    }
}
