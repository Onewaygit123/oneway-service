package com.service.oneway;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class OneWayApplication {
	private static final Logger LOGGER = LogManager.getLogger(OneWayApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(OneWayApplication.class, args);
		LOGGER.info("info");
		
	}

}
