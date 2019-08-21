package com.bae.entity;

import java.util.Date;

public class AuditSearchLog {

	private String username;
	private String searchTerm;
	private Date timeStamp;
	private String category;

	public AuditSearchLog(String username, String category, String searchTerm, Date timeStamp) {
		super();
		this.username = username;
		this.category = category;
		this.searchTerm = searchTerm;
		this.timeStamp = timeStamp;
	}

	public AuditSearchLog() {
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
