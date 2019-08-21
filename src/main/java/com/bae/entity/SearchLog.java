package com.bae.entity;

import java.util.Date;

public class SearchLog {

	private String username;
	private String searchTerm;
	private Date timeStamp;

	public SearchLog(String username, String searchTerm, Date timeStamp) {
		super();
		this.username = username;
		this.searchTerm = searchTerm;
		this.timeStamp = timeStamp;
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

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
}
