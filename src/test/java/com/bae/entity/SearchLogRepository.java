package com.bae.entity;

import org.junit.Test;

import junit.framework.Assert;

public class SearchLogRepository {
	SearchLog account = new SearchLog("Zilla", 1, "Gilla", null);
	
	@Test
	public void testGetterName() {

		Assert.assertEquals(account.getUsername(), "Zilla");
	}

	@Test
	public void testSetterName() {
		account.setUsername("Zilla2");
		Assert.assertEquals(account.getUsername(), "Zilla2");
	}
	
	@Test
	public void testGetterTerm() {

		Assert.assertEquals(account.getSearchTerm(), "Gilla");
	}

	@Test
	public void testSetterTerm() {
		account.setSearchTerm("Gilla2");
		Assert.assertEquals(account.getSearchTerm(), "Gilla2");
	}
	@Test
	public void testGetterId() {

		Assert.assertEquals(account.getId(), 1);
	}

	@Test
	public void testSetterId() {
		account.setId(2);
		Assert.assertEquals(account.getId(), 2);
	}
	
	@Test
	public void testGetterdate() {

		Assert.assertEquals(account.getDate(), null);
	}

	@Test
	public void testSetterdate() {
		account.setDate(null);
		Assert.assertEquals(account.getDate(), null);
	}
}