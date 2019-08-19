package com.bae.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.entity.AuditRequestLog;
import com.bae.service.AuditRequestLogService;

@RestController
@RequestMapping("${path.requestLogs}")
public class AuditRequestLogController {

	private AuditRequestLogService service;

	@Autowired
	public AuditRequestLogController(AuditRequestLogService service) {
		this.service = service;
	}

	@GetMapping("${path.getAuditRequestLogs}")
	public Collection<AuditRequestLog> getAuditRequestLogs() {
		return service.getAuditRequestLogs();

	}

	public AuditRequestLogService getService() {
		return service;
	}

	public void setService(AuditRequestLogService service) {
		this.service = service;
	}

}
