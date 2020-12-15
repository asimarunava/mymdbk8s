package com.vortexmind.mymdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.vortexmind")
public class MymdbAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MymdbAppApplication.class, args);
	}

}
