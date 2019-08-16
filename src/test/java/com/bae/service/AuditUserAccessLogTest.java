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

import com.bae.entity.AuditUserAccessLog;
import com.bae.repository.AuditUserAccessLogRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuditUserAccessLogTest {

	@InjectMocks
	SearchLogServiceImpl service;

	@Mock
	AuditUserAccessLogRepository repository;

	public static AuditUserAccessLog MOCK_USER_OBJECT = new AuditUserAccessLog();
	public static final AuditUserAccessLog MOCK_USER_OBJECT2 = new AuditUserAccessLog();

	@Test
	public void getAllUsersTest() {
		List<AuditUserAccessLog> MOCK_USER_ARRAY = new ArrayList<>();
		MOCK_USER_ARRAY.add(MOCK_USER_OBJECT);
		MOCK_USER_ARRAY.add(MOCK_USER_OBJECT2);
		Mockito.when(repository.findAll()).thenReturn(MOCK_USER_ARRAY);
		assertEquals(MOCK_USER_ARRAY, service.getAllLogs());
		Mockito.verify(repository).findAll();
	}
}