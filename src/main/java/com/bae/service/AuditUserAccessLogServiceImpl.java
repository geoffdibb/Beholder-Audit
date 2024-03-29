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
	public Collection<AuditUserAccessLog> getAuditUserAccessLogs() {
		return repository.findAll();
	}

	@JmsListener(destination = "AuditUserAccessQueue", containerFactory = "myFactory")
	public void sendAuditUserAccessLog(AuditUserAccessLog log) {
		repository.save(log);
	}

	public AuditUserAccessLogRepository getRepository() {
		return repository;
	}

	public void setRepository(AuditUserAccessLogRepository repository) {
		this.repository = repository;
	}

}
