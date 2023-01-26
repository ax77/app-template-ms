/*
 * Copyright (c) 2023. All rights reserved. https://github.com/ax77
 */

package com.applicantservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ApplicantResponse {
    private Long id;

    private String name;

    private String position;
}
