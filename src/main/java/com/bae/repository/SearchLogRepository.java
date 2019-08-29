package com.bae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bae.entity.AuditSearchLog;

public interface SearchLogRepository extends MongoRepository<AuditSearchLog, Long> {

}
