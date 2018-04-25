package com.example.greenfox.demo.repo;

import com.example.greenfox.demo.models.Tickets;
import org.springframework.data.repository.CrudRepository;
import sun.util.resources.ru.CalendarData_ru;

public interface TicketsRepo extends CrudRepository<Tickets, Integer>{
}
