package com.bae.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.entity.SearchLog;
import com.bae.service.SearchLogService;

@RestController
@RequestMapping("/searchlogs")
public class SearchLogController {

	@Autowired
	public SearchLogController(SearchLogService service) {
		this.service = service;
	}

	private SearchLogService service;

	@GetMapping("/getSearchLog")
	public Collection<SearchLog> getSearchLogs() {
		return service.getSearchLogs();
	}
}
