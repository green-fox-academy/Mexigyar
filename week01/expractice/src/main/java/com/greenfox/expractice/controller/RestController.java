package com.greenfox.expractice.controller;

import com.greenfox.expractice.model.JsonPlateResults;
import com.greenfox.expractice.repo.LicenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    LicenceRepo licenceRepo;

    @GetMapping("/api/search/{brand}")
    public JsonPlateResults jsonResult(@PathVariable(name = "brand") String brand){
        return new JsonPlateResults(licenceRepo.findAllByCarBrandEquals(brand));
    }
}
