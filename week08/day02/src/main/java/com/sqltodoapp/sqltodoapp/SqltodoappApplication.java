package com.sqltodoapp.sqltodoapp;

import com.sqltodoapp.sqltodoapp.Model.Todo;
import com.sqltodoapp.sqltodoapp.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqltodoappApplication implements CommandLineRunner{
	@Autowired
	TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(SqltodoappApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("finish something"));
		todoRepository.save(new Todo("make cake"));
	}
}

