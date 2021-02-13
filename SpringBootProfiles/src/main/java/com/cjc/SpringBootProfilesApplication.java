package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProfilesApplication {

	public static void main(String[] args) 
	{
		System.out.println("hello spring boot profiles");
		SpringApplication.run(SpringBootProfilesApplication.class, args);
	}

}
