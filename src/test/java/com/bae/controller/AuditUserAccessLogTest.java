package com.bae.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.service.AuditUserAccessLogServiceImpl;
import com.bae.util.TestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuditUserAccessLogTest {

	@InjectMocks
	AuditUserAccessLogController controller;

	@Mock
	AuditUserAccessLogServiceImpl service;

	@Test
	public void getAllUsersTest() {
		TestConstants.MOCK_AUDIT_USER_ACCESS_ARRAY.add(TestConstants.MOCK_AUDIT_USER_ACCESS_LOG);
		TestConstants.MOCK_AUDIT_USER_ACCESS_ARRAY.add(TestConstants.MOCK_AUDIT_USER_ACCESS_LOG2);
		Mockito.when(service.getAllAccessLogs()).thenReturn(TestConstants.MOCK_AUDIT_USER_ACCESS_ARRAY);
		assertEquals(TestConstants.MOCK_AUDIT_USER_ACCESS_ARRAY, controller.getAllAccessLogs());
		Mockito.verify(service).getAllAccessLogs();
	}
}