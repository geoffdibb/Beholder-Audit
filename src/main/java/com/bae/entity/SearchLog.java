package com.bae.entity;

import java.sql.Date;

public class SearchLog {

	private String username;
	private long id;
	private String searchTerm;
	private Date date;
	public SearchLog(String username, long id, String searchTerm, Date date) {
		super();
		this.username = username;
		this.id = id;
		this.searchTerm = searchTerm;
		this.date = date;
	} 
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
