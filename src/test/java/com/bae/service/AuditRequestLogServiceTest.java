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
	private AuditRequestLogServiceImpl service;

	@Mock
	private AuditRequestLogRepository repository;

	@Test
	public void getAllUsersTest() {
		TestConstants.MOCK_AUDIT_REQUEST_LOG_ARRAY.add(TestConstants.MOCK_AUDIT_REQUEST_LOG);
		TestConstants.MOCK_AUDIT_REQUEST_LOG_ARRAY.add(TestConstants.MOCK_AUDIT_REQUEST_LOG2);
		Mockito.when(repository.findAll()).thenReturn(TestConstants.MOCK_AUDIT_REQUEST_LOG_ARRAY);
		assertEquals(TestConstants.MOCK_AUDIT_REQUEST_LOG_ARRAY, service.getAuditRequestLogs());
		Mockito.verify(repository).findAll();
	}

//	@Test
//	public void sendAuditRequestLogTest() {
//		Mockito.when(repository.save(TestConstants.MOCK_AUDIT_REQUEST_LOG))
//				.thenReturn(TestConstants.MOCK_AUDIT_REQUEST_LOG);
//		assertEquals("{\"message\": \"audit request log successfully saved\"}",
//				service.sendAuditRequestLog(TestConstants.MOCK_AUDIT_REQUEST_LOG));
//		Mockito.verify(repository).save(TestConstants.MOCK_AUDIT_REQUEST_LOG);
//	}

	@Test
	public void getRepositoryTest() {
		assertEquals(repository, service.getRepository());
	}

	@Test
	public void setRepositoryTest() {
		service.setRepository(repository);
		assertEquals(repository, service.getRepository());
	}
}