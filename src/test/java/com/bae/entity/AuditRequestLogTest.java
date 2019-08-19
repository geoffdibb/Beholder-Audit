package com.bae.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AuditRequestLogTest {

	@Test
	public void auditRequestLogTest() {
		AuditRequestLog auditRequestLog = new AuditRequestLog("", 0, null);

		auditRequestLog.setId(1);
		auditRequestLog.setUsername("username");

		assertEquals(1, auditRequestLog.getId());
		assertEquals("username", auditRequestLog.getUsername());
	}

}
