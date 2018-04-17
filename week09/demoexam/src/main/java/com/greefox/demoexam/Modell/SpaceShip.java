package com.greefox.demoexam.Modell;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SpaceShip {

    @Id
    private Integer id;
    private int max_capacity;
    private String planet;
    private int utilization;

    public SpaceShip(Integer id) {
        this.id = id;
    }

    public SpaceShip(Integer id, int max_capacity, String planet, int utilization) {
        this.id = id;
        this.max_capacity = max_capacity;
        this.planet = planet;
        this.utilization = utilization;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMax_capacity(int max_capacity) {
        this.max_capacity = max_capacity;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public void setUtilization(int utilization) {
        this.utilization = utilization;
    }

    public long getId() {
        return id;
    }

    public int getMax_capacity() {
        return max_capacity;
    }

    public String getPlanet() {
        return planet;
    }

    public int getUtilization() {
        return utilization;
    }
}
