package com.greenfoxacademy.spring2.spring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class Spring2Application {
	@RequestMapping(value="/hello")
	@ResponseBody
	public String hello(){

		return "Welcome to Animal Bank!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Spring2Application.class, args);
	}
}
