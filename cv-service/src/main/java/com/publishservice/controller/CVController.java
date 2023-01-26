/*
 * Copyright (c) 2023. All rights reserved. https://github.com/ax77
 */

package com.publishservice.controller;

import com.publishservice.dto.CVRequest;
import com.publishservice.dto.CVResponse;
import com.publishservice.payload.JsonResponse;
import com.publishservice.service.CVService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cv/")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", maxAge = 7200)
public class CVController {
    private final CVService cvService;

    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public JsonResponse createCV(@RequestBody CVRequest cvRequest) {
        cvService.createCv(cvRequest);
        return new JsonResponse("ok", cvRequest.getCompany());
    }

    @GetMapping("all")
    @ResponseStatus(HttpStatus.OK)
    public List<CVResponse> getAllCvs() {
        return cvService.getAllCvs();
    }

    @GetMapping("company/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<CVResponse> findByCompany(@PathVariable String name) {
        return cvService.findByCompany(name);
    }
}