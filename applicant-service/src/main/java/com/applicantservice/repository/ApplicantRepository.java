/*
 * Copyright (c) 2023. All rights reserved. https://github.com/ax77
 */

package com.applicantservice.repository;

import com.applicantservice.entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant, Long> {
}
