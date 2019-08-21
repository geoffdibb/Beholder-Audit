package com.bae.entity;

import java.util.Date;

public class AuditRequestLog {
	private String username;
	private Date timeStamp;

	public AuditRequestLog(String username, Date timeStamp) {
		super();
		this.username = username;
		this.timeStamp = timeStamp;
	}

	public AuditRequestLog() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
}
