package com.bae.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.entity.AuditRequestLog;
import com.bae.repository.AuditRequestLogRepository;
@Service
public class AuditRequestLogServiceImpl implements AuditRequestLogService {

	private AuditRequestLogRepository repository;
	
	
	@Autowired
	public AuditRequestLogServiceImpl(AuditRequestLogRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public Collection<AuditRequestLog> getAllRequestLogs() {
		Collection<AuditRequestLog> newList = repository.findAll();
		return newList;
	}

}
