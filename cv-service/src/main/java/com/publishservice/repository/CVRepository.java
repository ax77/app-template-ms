/*
 * Copyright (c) 2023. All rights reserved. https://github.com/ax77
 */

package com.publishservice.repository;

import com.publishservice.model.CV;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CVRepository extends MongoRepository<CV, String> {
    @Query("{ 'company' : ?0 }")
    List<CV> findByCompany(String v);

    @Query("{ 'company' : { $regex: ?0 } }")
    List<CV> findByCompanyRegex(String v);

    @Query("{ 'vacancy' : ?0 }")
    List<CV> findByVacancy(String v);

    @Query("{ 'vacancy' : { $regex: ?0 } }")
    List<CV> findByVacancyRegex(String v);

}
