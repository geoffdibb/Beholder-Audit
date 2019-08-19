package com.bae.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
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
	public Collection<AuditRequestLog> getAuditRequestLogs() {
		Collection<AuditRequestLog> newList = repository.findAll();
		return newList;
	}

	@JmsListener(destination = "Queue", containerFactory = "myFactory")
	public void sendAuditRequestLog(AuditRequestLog log) {
		repository.save(log);
	}
}