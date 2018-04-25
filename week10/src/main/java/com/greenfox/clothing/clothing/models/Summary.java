package com.greenfox.clothing.clothing.models;

public class Summary {
     private String item;
    private String size;
    private String numberOfItems;

    public Summary() {
    }

    public Summary(String item, String size, String numberOfItems) {
        this.item = item;
        this.size = size;
        this.numberOfItems = numberOfItems;

    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setNumberOfItems(String numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public String getItem() {
        return item;
    }

    public String getSize() {
        return size;
    }

    public String getNumberOfItems() {
        return numberOfItems;
    }
}
