/*
 * Copyright (c) 2023. All rights reserved. https://github.com/ax77
 */

package com.publishservice.service;

import com.publishservice.dto.CVRequest;
import com.publishservice.dto.CVResponse;
import com.publishservice.model.CV;
import com.publishservice.repository.CVRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CVService {
    private final CVRepository cvRepository;

    public void createCv(CVRequest cvRequest) {
        CV cv = CV.builder()
                .company(cvRequest.getCompany())
                .salary(cvRequest.getSalary())
                .vacancy(cvRequest.getVacancy())
                .build();

        cvRepository.save(cv);
        log.info("CV {} was saved", cv.getId());
    }

    public List<CVResponse> getAllCvs() {
        List<CV> cvs = cvRepository.findAll();
        return cvs.stream().map(this::mapToCvResponse).toList();
    }

    private CVResponse mapToCvResponse(CV cv) {
        return CVResponse.builder()
                .id(cv.getId())
                .vacancy(cv.getVacancy())
                .salary(cv.getSalary())
                .company(cv.getCompany()).build();
    }


}
