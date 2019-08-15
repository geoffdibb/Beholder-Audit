package com.bae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bae.entity.SearchLog;

public interface SearchLogRepository extends MongoRepository<SearchLog, Long> {

}
