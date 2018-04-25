package com.greenfox.clothing.clothing.service;

import com.greenfox.clothing.clothing.models.Warehouse;
import com.greenfox.clothing.clothing.repo.WarehouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    WarehouseRepo warehouseRepo;

    @Override
    public List<String> getAvailableItemNames() {
        List<Warehouse> listWithDuplicates = new ArrayList<>();
        warehouseRepo.findAll().forEach(listWithDuplicates::add);
        List<String> itemNames = toItemNameList(listWithDuplicates);
        List<String> listWithoutDuplicates = itemNames.stream()
                .distinct()
                .collect(Collectors.toList());
        return listWithoutDuplicates;
    }

    @Override
    public List<String> getAvailableItemSizes() {
        List<Warehouse> listWithDuplicates = new ArrayList<>();
        warehouseRepo.findAll().forEach(listWithDuplicates::add);
        List<String> itemNames = toSizeList(listWithDuplicates);
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
    List<String> toSizeList(List<Warehouse> warehouseList) {
        List<String> stringList = new ArrayList<String>();
        for (Warehouse warehouse : warehouseList) {
            stringList.add(warehouse.getSize());
        }
        return stringList;
    }
}
