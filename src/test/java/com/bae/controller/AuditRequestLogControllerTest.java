package com.bae.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.service.AuditRequestLogServiceImpl;
import com.bae.util.TestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuditRequestLogControllerTest {
	@InjectMocks
	AuditRequestLogController controller;

	@Mock
	AuditRequestLogServiceImpl service;

	@Test
	public void getAllUsersTest() {
		TestConstants.MOCK_AUDIT_REQUEST_LOG_ARRAY.add(TestConstants.MOCK_AUDIT_REQUEST_LOG);
		TestConstants.MOCK_AUDIT_REQUEST_LOG_ARRAY.add(TestConstants.MOCK_AUDIT_REQUEST_LOG2);
		Mockito.when(service.getAllRequestLogs()).thenReturn(TestConstants.MOCK_AUDIT_REQUEST_LOG_ARRAY);
		assertEquals(TestConstants.MOCK_AUDIT_REQUEST_LOG_ARRAY, controller.getAllRequestLogs());
		Mockito.verify(service).getAllRequestLogs();
	}
}