/*
 * Copyright (c) 2023. All rights reserved. https://github.com/ax77
 */

package com.applicantservice;

import com.applicantservice.entity.Applicant;
import com.applicantservice.repository.ApplicantRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ApplicantIntegrationTest {

    @Autowired
    private ApplicantRepository applicantRepository;

    @Test
    public void testCreate() {
        Applicant applicant = Applicant.builder().name("john").position("go developer").build();
        applicantRepository.save(applicant);
        Assertions.assertEquals(1, applicantRepository.findAll().size());
    }

}
