package com.bae.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.service.AuditUserAccessLogService;
import com.bae.service.AuditUserAccessLogServiceImpl;
import com.bae.util.TestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuditUserAccessLogTest {

	@InjectMocks
	private AuditUserAccessLogController controller;

	@Mock
	private AuditUserAccessLogServiceImpl service;

	@Test
	public void getAllUsersTest() {
		TestConstants.MOCK_AUDIT_USER_ACCESS_ARRAY.add(TestConstants.MOCK_AUDIT_USER_ACCESS_LOG);
		TestConstants.MOCK_AUDIT_USER_ACCESS_ARRAY.add(TestConstants.MOCK_AUDIT_USER_ACCESS_LOG2);
		Mockito.when(service.getAuditUserAccessLogs()).thenReturn(TestConstants.MOCK_AUDIT_USER_ACCESS_ARRAY);
		assertEquals(TestConstants.MOCK_AUDIT_USER_ACCESS_ARRAY, controller.getAuditUserAccessLogs());
		Mockito.verify(service).getAuditUserAccessLogs();
	}

	@Test
	public void getServiceTest() {
		AuditUserAccessLogService AuditUserAccessLogService = service;
		assertEquals(AuditUserAccessLogService, controller.getService());
	}
}