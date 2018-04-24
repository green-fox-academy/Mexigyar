package com.greenfox.expractice.model;


import java.util.List;

public class JsonPlateResults {

    String result;
    List<LicencePlates> data;

    public JsonPlateResults() {
    }

    public JsonPlateResults(List<LicencePlates> data) {
        this.result = "ok";
        this.data = data;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setData(List<LicencePlates> data) {
        this.data = data;
    }

    public String getResult() {
        return result;
    }

    public List<LicencePlates> getData() {
        return data;
    }
}
