package com.publishservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CVResponse {
    private String id;
    private String company;
    private String vacancy;
    private BigDecimal salary;
}
