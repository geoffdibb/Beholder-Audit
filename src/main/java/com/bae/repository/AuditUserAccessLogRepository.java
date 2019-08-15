package com.bae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bae.entity.AuditUserAccessLog;

public interface AuditUserAccessLogRepository extends MongoRepository<AuditUserAccessLog, Long> {

}
