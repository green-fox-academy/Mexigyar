package com.greenfox.clothing.clothing.repo;

import com.greenfox.clothing.clothing.models.Warehouse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface WarehouseRepo extends CrudRepository<Warehouse, Integer> {
    ArrayList<Warehouse> findAllByUnitPriceIsLessThan(float price);
    ArrayList<Warehouse> findAllByUnitPriceGreaterThan(float price);
    ArrayList<Warehouse> findAllByUnitPriceEquals(float price);
    Warehouse findFirstByItemNameEquals(String name);
}
