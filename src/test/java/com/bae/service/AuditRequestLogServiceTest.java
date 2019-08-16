package com.bae.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.entity.AuditRequestLog;

import com.bae.repository.AuditRequestLogRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuditRequestLogServiceTest { 
	@InjectMocks
	AuditRequestLogServiceImpl service;

	@Mock
	AuditRequestLogRepository repository;

	public static AuditRequestLog MOCK_USER_OBJECT = new AuditRequestLog(null, 0, null);
	public static final AuditRequestLog MOCK_USER_OBJECT2 = new AuditRequestLog(null, 0, null);

	@Test
	public void getAllUsersTest() {
		List<AuditRequestLog> MOCK_USER_ARRAY = new ArrayList<>();
		MOCK_USER_ARRAY.add(MOCK_USER_OBJECT);
		MOCK_USER_ARRAY.add(MOCK_USER_OBJECT2);
		Mockito.when(repository.findAll()).thenReturn(MOCK_USER_ARRAY);
		assertEquals(MOCK_USER_ARRAY, service.getAllRequestLogs());
		Mockito.verify(repository).findAll();
	}
}