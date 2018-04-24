package com.greenfox.clothing.clothing.repo;

import com.greenfox.clothing.clothing.models.Warehouse;
import com.sun.tools.javac.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WarehouseRepo extends CrudRepository<Warehouse, Integer>{
    List<Warehouse> findAllByUnitPriceIsLessThan(float price);
    List<Warehouse> findAllByUnitPriceGreaterThan(float price);
    List<Warehouse> findAllByUnitPriceEquals(float price);
}
