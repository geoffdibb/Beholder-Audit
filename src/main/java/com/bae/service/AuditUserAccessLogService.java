package com.bae.service;

import java.util.Collection;


import com.bae.entity.AuditUserAccessLog;

public interface AuditUserAccessLogService {

	Collection<AuditUserAccessLog> getAllAccessLogs();


}
