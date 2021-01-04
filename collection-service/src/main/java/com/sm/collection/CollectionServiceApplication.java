package com.sm.collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sm.collection")
public class CollectionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionServiceApplication.class, args);
	}

}
