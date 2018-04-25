package com.example.greenfox.demo;

import com.example.greenfox.demo.models.Tickets;
import com.example.greenfox.demo.repo.TicketsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	TicketsRepo ticketsRepo;

	public static void main(String[] args)  {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
