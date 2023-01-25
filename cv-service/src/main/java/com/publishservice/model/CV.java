/*
 * Copyright (c) 2023. All rights reserved. https://github.com/ax77
 */

package com.publishservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "cv")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CV {
    @Id
    private String id;
    private String company;
    private String vacancy;
    private BigDecimal salary;
}
