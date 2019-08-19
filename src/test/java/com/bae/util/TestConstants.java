package com.bae.util;

import java.util.ArrayList;
import java.util.List;

import com.bae.entity.AuditRequestLog;
import com.bae.entity.AuditUserAccessLog;
import com.bae.entity.SearchLog;

public class TestConstants {

	public static final SearchLog MOCK_SEARCH_LOG = new SearchLog(null, 0, null, null);
	public static final SearchLog MOCK_SEARCH_LOG2 = new SearchLog(null, 0, null, null);
	public static List<SearchLog> MOCK_SEARCH_LOG_ARRAY = new ArrayList<>();

	public static final AuditRequestLog MOCK_AUDIT_REQUEST_LOG = new AuditRequestLog(null, 0, null);
	public static final AuditRequestLog MOCK_AUDIT_REQUEST_LOG2 = new AuditRequestLog(null, 0, null);
	public static List<AuditRequestLog> MOCK_AUDIT_REQUEST_LOG_ARRAY = new ArrayList<>();

	public static final AuditUserAccessLog MOCK_AUDIT_USER_ACCESS_LOG = new AuditUserAccessLog("blank", 0, null);
	public static final AuditUserAccessLog MOCK_AUDIT_USER_ACCESS_LOG2 = new AuditUserAccessLog("blank", 0, null);
	public static List<AuditUserAccessLog> MOCK_AUDIT_USER_ACCESS_ARRAY = new ArrayList<>();
}