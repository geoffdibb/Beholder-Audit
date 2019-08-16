package com.bae.service;

import java.util.Collection;

import org.apache.catalina.AccessLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.entity.AuditUserAccessLog;
import com.bae.entity.SearchLog;
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
	


}
