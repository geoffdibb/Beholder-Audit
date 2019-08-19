package com.bae.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.repository.AuditUserAccessLogRepository;
import com.bae.util.TestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuditUserAccessLogTest {

	@InjectMocks
	AuditUserAccessLogServiceImpl service;

	@Mock
	AuditUserAccessLogRepository repository;

	@Test
	public void getAllUsersTest() {
		TestConstants.MOCK_AUDIT_USER_ACCESS_ARRAY.add(TestConstants.MOCK_AUDIT_USER_ACCESS_LOG);
		TestConstants.MOCK_AUDIT_USER_ACCESS_ARRAY.add(TestConstants.MOCK_AUDIT_USER_ACCESS_LOG2);
		Mockito.when(repository.findAll()).thenReturn(TestConstants.MOCK_AUDIT_USER_ACCESS_ARRAY);
		assertEquals(TestConstants.MOCK_AUDIT_USER_ACCESS_ARRAY, service.getAllAccessLogs());
		Mockito.verify(repository).findAll();
	}
}