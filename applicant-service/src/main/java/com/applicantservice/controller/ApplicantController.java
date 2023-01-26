/*
 * Copyright (c) 2023. All rights reserved. https://github.com/ax77
 */

package com.applicantservice.controller;

import com.applicantservice.dto.ApplicantRequest;
import com.applicantservice.service.ApplicantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/applicant/")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", maxAge = 7200)
public class ApplicantController {

    private final ApplicantService applicantService;

    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewApplicant(@RequestBody ApplicantRequest applicantRequest) {
        applicantService.save(applicantRequest);
    }

}
