package com.bae.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.entity.AuditUserAccessLog;
import com.bae.service.AuditUserAccessLogService;

@RestController
@RequestMapping("${path.accessLogs}")
public class AuditUserAccessLogController {

	private AuditUserAccessLogService service;

	@Autowired
	public AuditUserAccessLogController(AuditUserAccessLogService service) {
		this.service = service;
	}

	@GetMapping("${path.getAuditUserAccessLogs}")
	public Collection<AuditUserAccessLog> getAuditUserAccessLogs() {
		return service.getAuditUserAccessLogs();
	}

	public AuditUserAccessLogService getService() {
		return service;
	}

	public void setService(AuditUserAccessLogService service) {
		this.service = service;
	}

}
