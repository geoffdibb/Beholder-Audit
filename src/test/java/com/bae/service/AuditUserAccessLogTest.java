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
	private AuditUserAccessLogServiceImpl service;

	@Mock
	private AuditUserAccessLogRepository repository;

	@Test
	public void getAllUsersTest() {
		TestConstants.MOCK_AUDIT_USER_ACCESS_ARRAY.add(TestConstants.MOCK_AUDIT_USER_ACCESS_LOG);
		TestConstants.MOCK_AUDIT_USER_ACCESS_ARRAY.add(TestConstants.MOCK_AUDIT_USER_ACCESS_LOG2);
		Mockito.when(repository.findAll()).thenReturn(TestConstants.MOCK_AUDIT_USER_ACCESS_ARRAY);
		assertEquals(TestConstants.MOCK_AUDIT_USER_ACCESS_ARRAY, service.getAuditUserAccessLogs());
		Mockito.verify(repository).findAll();
	}

	@Test
	public void sendAuditUserAccessLogTest() {
		Mockito.when(repository.save(TestConstants.MOCK_AUDIT_USER_ACCESS_LOG))
				.thenReturn(TestConstants.MOCK_AUDIT_USER_ACCESS_LOG);
		assertEquals("{\"message\": \"audit access log successfully saved\"}",
				service.sendAuditUserAccessLog(TestConstants.MOCK_AUDIT_USER_ACCESS_LOG));
		Mockito.verify(repository).save(TestConstants.MOCK_AUDIT_USER_ACCESS_LOG);
	}

	@Test
	public void getRepositoryTest() {
		AuditUserAccessLogRepository AuditUserAccessLogRepo = repository;
		assertEquals(AuditUserAccessLogRepo, service.getRepository());
	}
}