package com.talzoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.talzoo"})
public class MiniboardjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniboardjpaApplication.class, args);
	}

}
