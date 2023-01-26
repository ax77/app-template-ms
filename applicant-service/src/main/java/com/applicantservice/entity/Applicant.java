/*
 * Copyright (c) 2023. All rights reserved. https://github.com/ax77
 */

package com.applicantservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "applicant")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 250)
    private String name;

    @Column(name = "position", nullable = false, length = 250)
    private String position;
}
