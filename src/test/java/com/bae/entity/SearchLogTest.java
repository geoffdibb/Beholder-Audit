package com.bae.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchLogTest {

	@Test
	public void searchLogTest() {
		SearchLog searchLog = new SearchLog(null, 0, null, null);

		searchLog.setSearchTerm("newSearch");
		searchLog.setId(1);
		searchLog.setUsername("username");

		assertEquals(1, searchLog.getId());
		assertEquals("newSearch", searchLog.getSearchTerm());
		assertEquals("username", searchLog.getUsername());
	}

}
