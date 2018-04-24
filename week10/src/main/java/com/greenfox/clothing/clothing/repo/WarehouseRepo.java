package com.greenfox.clothing.clothing.repo;

import com.greenfox.clothing.clothing.models.Warehouse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WarehouseRepo extends CrudRepository<Warehouse, Integer>{
}
