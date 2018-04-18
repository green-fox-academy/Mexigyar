package com.greefox.demoexam.Modell;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Planet {

    @Id
    private Integer id;
    private String name;
    private Integer population;

    public Planet(Integer id) {
        this.id = id;
    }

    public Planet() {
    }

    public Planet(Integer id, String name, Integer population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}
