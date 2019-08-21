package com.bae.entity;

import java.sql.Date;

public class SearchLog {

	private String username;
	private String searchTerm;
	private Date date;

	public SearchLog(String username, String searchTerm, Date date) {
		super();
		this.username = username;
		this.searchTerm = searchTerm;
		this.date = date;
	}

	public SearchLog() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSearchTerm() {
		return searchTerm;
	}

	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
