package com.bae.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import com.bae.entity.SearchLog;
import com.bae.repository.SearchLogRepository;

@Service
public class SearchLogServiceImpl implements SearchLogService {

	private SearchLogRepository repository;

	@Autowired
	public SearchLogServiceImpl(SearchLogRepository repository) {
		this.repository = repository;

	}

	@Override
	public Collection<SearchLog> getSearchLogs() {
		return repository.findAll();
	}

	@JmsListener(destination = "SearchLogQueue", containerFactory = "myFactory")
	public void sendSearchLog(SearchLog log) {
		repository.save(log);
	}

	public SearchLogRepository getRepository() {
		return repository;
	}

	public void setRepository(SearchLogRepository repository) {
		this.repository = repository;
	}

}
