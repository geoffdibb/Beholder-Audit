package com.bae.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AuditUserAccessLogTest {

	private AuditUserAccessLog account = new AuditUserAccessLog("user1", null);

	@Test
	public void testGetterName() {

		assertEquals("user1", account.getUsername());
	}

	@Test
	public void testSetterName() {
		account.setUsername("user2");
		assertEquals("user2", account.getUsername());
	}

//	@Test
//	public void testGetterId() {
//
//		assertEquals(1, account.getId());
//	}
//
//	@Test
//	public void testSetterId() {
//		account.setId(2);
//		assertEquals(2, account.getId());
//	}

	@Test
	public void testGetterTimeStamp() {

		assertEquals(null, account.getTimeStamp());
	}

	@Test
	public void testSetterTimeStamp() {
		account.setTimeStamp(null);
		;
		assertEquals(null, account.getTimeStamp());
	}

}
