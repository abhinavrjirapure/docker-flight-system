package com.docker.flightapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.docker.flightapp.repository"})
public class DockerFlightSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerFlightSystemApplication.class, args);
	}

}
