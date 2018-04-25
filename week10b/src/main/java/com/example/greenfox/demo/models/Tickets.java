package com.example.greenfox.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tickets {

    @Id
    @GeneratedValue
    Integer id;
    String reporter;
    String manufacturer;
    @Column(name="serialnumber")
    Long serialNumber;
    String description;
    String reportedAt;

    public Tickets() {
    }

    public Tickets(String reporter, String manufacturer, Long serailnumber, String description, String reportedAt) {
        this.reporter = reporter;
        this.manufacturer = manufacturer;
        this.serialNumber = serailnumber;
        this.description = description;
        this.reportedAt = reportedAt;
    }


  public Tickets(String reporter, String manufacturer, Long serailnumber, String description) {
        this.reporter = reporter;
        this.manufacturer = manufacturer;
        this.serialNumber = serailnumber;
        this.description = description;
        this.reportedAt = "Who knows";
    }



    public void setId(Integer id) {
        this.id = id;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSerailnumber(Long serailnumber) {
        this.serialNumber = serailnumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReportedAt(String reportedAt) {
        this.reportedAt = reportedAt;
    }

    public Integer getId() {
        return id;
    }

    public String getReporter() {
        return reporter;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Long getSerailnumber() {
        return serialNumber;
    }

    public String getDescription() {
        return description;
    }

    public String getReportedAt() {
        return reportedAt;
    }

    //(reporter, manufacturer, serialnumber, description, reported_at)
}
