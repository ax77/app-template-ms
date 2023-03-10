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

@Service
@RequiredArgsConstructor
@Slf4j
public class ApplicantService {
    private final ApplicantRepository applicantRepository;
    private final WebClient.Builder webClientBuilder;

    public void save(ApplicantRequest applicantRequest) {
        Applicant applicant = Applicant.builder()
                .name(applicantRequest.getName())
                .position(applicantRequest.getPosition())
                .build();
        Applicant result = applicantRepository.save(applicant);
        log.info("Applicant saved: {}:{}:{}", result.getId(), result.getName(), result.getPosition());
    }

    // TODO:webclient
    // TODO: hard-coded URL (localhost and cv-service(in docker))
    public CVResponse[] searchCv(String vacancy) {
        CVResponse[] result = webClientBuilder.build().get()
                .uri("http://cv-service/api/v1/cv/search/vacancy",
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
