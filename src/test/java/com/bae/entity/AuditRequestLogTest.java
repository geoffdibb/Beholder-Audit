package com.bae.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AuditRequestLogTest {

	private AuditRequestLog account = new AuditRequestLog("Zilla", 1, null);

	@Test
	public void testGetterName() {

		assertEquals(account.getUsername(), "Zilla");
	}

	@Test
	public void testSetterName() {
		account.setUsername("Zilla2");
		assertEquals(account.getUsername(), "Zilla2");
	}

	@Test
	public void testGetterId() {

		assertEquals(account.getId(), 1);
	}

	@Test
	public void testSetterId() {
		account.setId(2);
		assertEquals(account.getId(), 2);
	}

	@Test
	public void testGetterdate() {

		assertEquals(account.getDate(), null);
	}

	@Test
	public void testSetterdate() {
		account.setDate(null);
		assertEquals(account.getDate(), null);
	}

}
