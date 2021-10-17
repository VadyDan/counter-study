package com.example.counter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CounterApplication {

    private static final Logger LOG = LoggerFactory.getLogger(CounterApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CounterApplication.class, args);
        LOG.info("Springboot application is started successfully.");
    }

}
