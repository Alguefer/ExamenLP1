package com.example.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.crud.Entity")
public class CrudMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudMvcApplication.class, args);
	}

}
