package com.greenfox.clothing.clothing.service;

import com.greenfox.clothing.clothing.models.Warehouse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WarehouseService {

    List<String> getAvailableItemNames();
    List<String> getAvailableItemSizes();

}
