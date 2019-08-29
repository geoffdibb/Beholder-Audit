package com.bae.util;

import java.util.ArrayList;
import java.util.List;

import com.bae.entity.AuditRequestLog;
import com.bae.entity.AuditSearchLog;
import com.bae.entity.AuditUserAccessLog;

public class TestConstants {

	public static final AuditSearchLog MOCK_SEARCH_LOG = new AuditSearchLog(null, null, null, null);
	public static final AuditSearchLog MOCK_SEARCH_LOG2 = new AuditSearchLog(null, null, null, null);
	public static final List<AuditSearchLog> MOCK_SEARCH_LOG_ARRAY = new ArrayList<>();

	public static final AuditRequestLog MOCK_AUDIT_REQUEST_LOG = new AuditRequestLog(null, null);
	public static final AuditRequestLog MOCK_AUDIT_REQUEST_LOG2 = new AuditRequestLog(null, null);
	public static final List<AuditRequestLog> MOCK_AUDIT_REQUEST_LOG_ARRAY = new ArrayList<>();

	public static final AuditUserAccessLog MOCK_AUDIT_USER_ACCESS_LOG = new AuditUserAccessLog("blank", null);
	public static final AuditUserAccessLog MOCK_AUDIT_USER_ACCESS_LOG2 = new AuditUserAccessLog("blank", null);
	public static final List<AuditUserAccessLog> MOCK_AUDIT_USER_ACCESS_ARRAY = new ArrayList<>();
}
