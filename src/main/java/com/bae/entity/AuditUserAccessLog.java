package com.bae.entity;

import java.sql.Date;

public class AuditUserAccessLog {
	private String username;
	private Date date;

	public AuditUserAccessLog(String username, Date date) {
		super();
		this.username = username;
		this.date = date;
	}

	public AuditUserAccessLog() {

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
