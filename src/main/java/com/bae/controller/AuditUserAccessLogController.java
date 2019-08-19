package com.bae.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.entity.AuditUserAccessLog;
import com.bae.service.AuditUserAccessLogService;

@RestController
@RequestMapping("/accesslogs")
public class AuditUserAccessLogController {

	@Autowired
	public AuditUserAccessLogController(AuditUserAccessLogService service) {
		this.service = service;
	}

	public AuditUserAccessLogService service;

	@GetMapping("/getAuditUserAccessLog")
	public Collection<AuditUserAccessLog> GetAllAccessLogs() {
		return service.getAllAccessLogs();
	}

}
