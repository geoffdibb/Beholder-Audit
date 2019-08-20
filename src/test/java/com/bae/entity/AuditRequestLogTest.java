package com.bae.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AuditRequestLogTest {

	private AuditRequestLog account = new AuditRequestLog("auditUser", 1, null);

	@Test
	public void testGetterName() {

		assertEquals("auditUser", account.getUsername());
	}

	@Test
	public void testSetterName() {
		account.setUsername("auditUser2");
		assertEquals("auditUser2", account.getUsername());
	}

	@Test
	public void testGetterId() {

		assertEquals(1, account.getId());
	}

	@Test
	public void testSetterId() {
		account.setId(2);
		assertEquals(2, account.getId());
	}

	@Test
	public void testGetterdate() {

		assertEquals(null, account.getDate());
	}

	@Test
	public void testSetterdate() {
		account.setDate(null);
		assertEquals(null, account.getDate());
	}

}
