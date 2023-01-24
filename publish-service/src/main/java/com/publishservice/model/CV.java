package com.publishservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "cv")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CV {
    @Id
    private String id;
    private String name;
    private String vacancy;
    private BigDecimal salary;
}
