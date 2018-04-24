package com.greenfox.clothing.clothing.controllers;

import com.greenfox.clothing.clothing.models.JsonHouses;
import com.greenfox.clothing.clothing.repo.WarehouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    WarehouseRepo warehouseRepo;

    @RequestMapping("/warehouse/query")
    public JsonHouses jsonResult(@RequestParam(value = "price") float price, @RequestParam(value = "type") String type) {
        JsonHouses jsonHouses = new JsonHouses();
        if (type.equals("higher")){
            jsonHouses.setClothes(warehouseRepo.findAllByUnitPriceGreaterThan(price));
        } else if (type.equals("lower")){
            jsonHouses.setClothes(warehouseRepo.findAllByUnitPriceIsLessThan(price));
        } else if (type.equals("equals")){
            jsonHouses.setClothes(warehouseRepo.findAllByUnitPriceEquals(price));
        }
        return jsonHouses;
    }
}
//price=50&type=lower
//higher/lower/equal
