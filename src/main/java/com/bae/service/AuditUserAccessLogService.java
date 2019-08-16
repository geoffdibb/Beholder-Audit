package com.bae.service;

import java.util.Collection;

import org.apache.catalina.AccessLog;

import com.bae.entity.AuditUserAccessLog;

public interface AuditUserAccessLogService {

	Collection<AuditUserAccessLog> getAllAccessLogs();


}
