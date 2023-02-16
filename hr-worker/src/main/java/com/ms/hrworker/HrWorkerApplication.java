package com.ms.hrworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrWorkerApplication {

	public static void main(String[] args) {
		System.getProperties().put("server.port", 8001);
		SpringApplication.run(HrWorkerApplication.class, args);
	}

}
