/*
 * Copyright (c) 2023. All rights reserved. https://github.com/ax77
 */

package com.publishservice;

import com.publishservice.model.CV;
import com.publishservice.repository.CVRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class PublishServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PublishServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(CVRepository cvRepository) {
        cvRepository.deleteAll();
        return args -> {
            cvRepository.save(CV.builder().company("google").salary(BigDecimal.valueOf(1600)).vacancy("go developer").build());
            cvRepository.save(CV.builder().company("apple").salary(BigDecimal.valueOf(1600)).vacancy("swift developer").build());
            cvRepository.save(CV.builder().company("amazon").salary(BigDecimal.valueOf(1600)).vacancy("java developer").build());
        };
    }
}
