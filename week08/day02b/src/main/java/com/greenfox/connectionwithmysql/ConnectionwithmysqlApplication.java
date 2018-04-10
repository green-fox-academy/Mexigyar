package com.greenfox.connectionwithmysql;

import com.greenfox.connectionwithmysql.Model.Todo;
import com.greenfox.connectionwithmysql.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithmysqlApplication implements CommandLineRunner{

	@Autowired
	TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ConnectionwithmysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("make pancake"));
		todoRepository.save(new Todo("give the pancake away"));

	}
}
