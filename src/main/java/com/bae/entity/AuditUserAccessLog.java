package com.bae.entity;

import java.sql.Date;

public class AuditUserAccessLog {
	private String username;
	private long id;
	private Date date;
	
	
	public AuditUserAccessLog(String username, long id, Date date) {
		super();
		this.username = username;
		this.id = id;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
