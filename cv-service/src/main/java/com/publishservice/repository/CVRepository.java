/*
 * Copyright (c) 2023. All rights reserved. https://github.com/ax77
 */

package com.publishservice.repository;

import com.publishservice.model.CV;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CVRepository extends MongoRepository<CV, String> {
}
