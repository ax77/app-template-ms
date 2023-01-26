/*
 * Copyright (c) 2023. All rights reserved. https://github.com/ax77
 */

package com.applicantservice.service;

import com.applicantservice.dto.ApplicantRequest;
import com.applicantservice.dto.CVResponse;
import com.applicantservice.entity.Applicant;
import com.applicantservice.repository.ApplicantRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApplicantService {
    private final ApplicantRepository applicantRepository;
    private final WebClient webClient;

    public void save(ApplicantRequest applicantRequest) {
        Applicant applicant = Applicant.builder()
                .name(applicantRequest.getName())
                .position(applicantRequest.getPosition())
                .build();
        Applicant result = applicantRepository.save(applicant);
        log.info("Applicant saved: {}:{}:{}", result.getId(), result.getName(), result.getPosition());
    }

    // TODO:webclient
    public CVResponse[] searchCv(String vacancy) {
        CVResponse[] result = webClient.get()
                .uri("http://localhost:8080/api/v1/cv/search/vacancy",
                        uriBuilder -> uriBuilder.queryParam("name", vacancy).build())
                .retrieve().bodyToMono(CVResponse[].class)
                .block();
        log.info("finder: {}", result);

        if(result == null) {
            result = new CVResponse[]{};
        }
        return result;
    }

}
