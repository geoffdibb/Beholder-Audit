package com.bae.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.entity.AuditRequestLog;
import com.bae.service.AuditRequestLogService;

@RestController
@RequestMapping("/requestLogs")
public class AuditRequestLogController {

	@Autowired
	public AuditRequestLogController(AuditRequestLogService service) {
		this.service = service;
	}

	private AuditRequestLogService service;

	@GetMapping("/getAuditRequestLogs")
	public Collection<AuditRequestLog> getAuditRequestLogs() {
		return service.getAuditRequestLogs();

	}

}
