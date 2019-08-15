package com.bae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bae.entity.AuditRequestLog;

public interface AuditRequestLogRepository extends MongoRepository<AuditRequestLog, Long> {

}
