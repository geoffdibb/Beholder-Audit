package com.bae.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.entity.AuditRequestLog;
import com.bae.service.AuditRequestLogService;

@RestController
@RequestMapping("/requestlogs")
public class AuditRequestLogController {

	@Autowired
	public AuditRequestLogController(AuditRequestLogService service) {
this.service = service;
	}
	public AuditRequestLogService service;
	
	@GetMapping("/getAll")
	public Collection<AuditRequestLog> getAllRequestLogs() {
			return service.getAllRequestLogs();
			
	}
	
}
