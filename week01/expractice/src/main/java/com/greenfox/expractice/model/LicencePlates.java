package com.greenfox.expractice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LicencePlates {

    @Id
    String plate;
    String carBrand;
    String carModel;
    String color;
    String year;

    public LicencePlates() {
    }

    public LicencePlates(String plate, String carBrand, String carModel, String color, String year) {
        this.plate = plate;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.color = color;
        this.year = year;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPlate() {
        return plate;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getColor() {
        return color;
    }

    public String getYear() {
        return year;
    }
}
