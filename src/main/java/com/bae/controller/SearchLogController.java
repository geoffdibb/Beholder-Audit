package com.bae.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.entity.AuditSearchLog;
import com.bae.service.SearchLogService;

@RestController
@RequestMapping("${path.searchLog}")
public class SearchLogController {

	private SearchLogService service;

	@Autowired
	public SearchLogController(SearchLogService service) {
		this.service = service;
	}

	@GetMapping("${path.getSearchLogs}")
	public Collection<AuditSearchLog> getSearchLogs() {
		return service.getSearchLogs();
	}

	public SearchLogService getService() {
		return service;
	}

	public void setService(SearchLogService service) {
		this.service = service;
	}

}
