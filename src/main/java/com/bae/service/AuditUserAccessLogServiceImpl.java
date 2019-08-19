package com.bae.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import com.bae.entity.AuditUserAccessLog;
import com.bae.repository.AuditUserAccessLogRepository;

@Service
public class AuditUserAccessLogServiceImpl implements AuditUserAccessLogService {

	private AuditUserAccessLogRepository repository;

	@Autowired
	public AuditUserAccessLogServiceImpl(AuditUserAccessLogRepository repository) {
		this.repository = repository;

	}

	@Override
	public Collection<AuditUserAccessLog> getAllAccessLogs() {
		Collection<AuditUserAccessLog> newList = repository.findAll();
		return newList;
	}

	@JmsListener(destination = "Queue", containerFactory = "myFactory")
	public void sendAuditUserAccessLog(AuditUserAccessLog log) {
		repository.save(log);
	}

}
