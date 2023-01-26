/*
 * Copyright (c) 2023. All rights reserved. https://github.com/ax77
 */

package com.applicantservice.service;

import com.applicantservice.dto.ApplicantRequest;
import com.applicantservice.entity.Applicant;
import com.applicantservice.repository.ApplicantRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApplicantService {
    private final ApplicantRepository applicantRepository;

    public void save(ApplicantRequest applicantRequest) {
        Applicant applicant = Applicant.builder()
                .name(applicantRequest.getName())
                .position(applicantRequest.getPosition())
                .build();
        Applicant result = applicantRepository.save(applicant);
        log.info("Applicant saved: {}:{}:{}", result.getId(), result.getName(), result.getPosition());
    }
}
