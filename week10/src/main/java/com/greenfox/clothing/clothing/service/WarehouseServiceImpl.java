package com.greenfox.clothing.clothing.service;

import com.greenfox.clothing.clothing.models.Warehouse;
import com.greenfox.clothing.clothing.repo.WarehouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.expression.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    WarehouseRepo warehouseRepo;

    @Override
    public List<String> getAvailableItems() {
        List<Warehouse> listWithDuplicates = new ArrayList<>();
        warehouseRepo.findAll().forEach(listWithDuplicates::add);
        List<String> itemNames = toItemNameList(listWithDuplicates)
                ;
        List<String> listWithoutDuplicates = itemNames.stream()
                .distinct()
                .collect(Collectors.toList());
        return listWithoutDuplicates;
    }
    
    List<String> toItemNameList(List<Warehouse> warehouseList) {

        List<String> stringList = new ArrayList<String>();

        for (Warehouse warehouse : warehouseList) {
            stringList.add(warehouse.getItemName());
        }
        return stringList;
    }
}
