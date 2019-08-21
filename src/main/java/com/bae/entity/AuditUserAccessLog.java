package com.bae.entity;

import java.util.Date;

public class AuditUserAccessLog {
	private String username;
	private Date timeStamp;

	public AuditUserAccessLog(String username, Date timeStamp) {
		super();
		this.username = username;
		this.timeStamp = timeStamp;
	}

	public AuditUserAccessLog() {

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

	public void settimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
}
