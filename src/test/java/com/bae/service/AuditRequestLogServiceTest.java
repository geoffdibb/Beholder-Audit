package com.bae.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.repository.AuditRequestLogRepository;
import com.bae.util.TestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuditRequestLogServiceTest {
	@InjectMocks
	AuditRequestLogServiceImpl service;

	@Mock
	AuditRequestLogRepository repository;

	@Test
	public void getAllUsersTest() {
		TestConstants.MOCK_AUDIT_REQUEST_LOG_ARRAY.add(TestConstants.MOCK_AUDIT_REQUEST_LOG);
		TestConstants.MOCK_AUDIT_REQUEST_LOG_ARRAY.add(TestConstants.MOCK_AUDIT_REQUEST_LOG2);
		Mockito.when(repository.findAll()).thenReturn(TestConstants.MOCK_AUDIT_REQUEST_LOG_ARRAY);
		assertEquals(TestConstants.MOCK_AUDIT_REQUEST_LOG_ARRAY, service.getAuditRequestLogs());
		Mockito.verify(repository).findAll();
	}
}