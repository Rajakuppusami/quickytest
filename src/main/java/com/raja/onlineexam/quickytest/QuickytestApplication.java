package com.raja.onlineexam.quickytest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickytestApplication {
	
	private static final Logger logger = LogManager.getLogger(QuickytestApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(QuickytestApplication.class, args);
		logger.info("------------------------------------------");
		logger.info("Application Started");
		logger.info("------------------------------------------");
		logger.debug("Debugging log");
        logger.info("Info log");
        logger.warn("Hey, This is a warning!");
        logger.error("Oops! We have an Error. OK");
        logger.fatal("Damn! Fatal error. Please fix me.");
	}
}
