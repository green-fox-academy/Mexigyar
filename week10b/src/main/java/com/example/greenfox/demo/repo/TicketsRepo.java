package com.example.greenfox.demo.repo;

import com.example.greenfox.demo.models.Tickets;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TicketsRepo extends CrudRepository<Tickets, Integer>{

    List<Tickets> findAllByManufacturerEquals(String string);
}
