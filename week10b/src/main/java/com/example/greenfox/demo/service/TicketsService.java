package com.example.greenfox.demo.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Service
public class TicketsService {

    public String getCuurentTime() {
      LocalDate today = LocalDate.now();
        return today.toString();
    }


}
