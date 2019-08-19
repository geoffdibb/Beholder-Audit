package com.bae.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.repository.SearchLogRepository;
import com.bae.util.TestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchLogServiceTest {

	@InjectMocks
	private SearchLogServiceImpl service;

	@Mock
	private SearchLogRepository repository;

	@Test
	public void getAllUsersTest() {
		TestConstants.MOCK_SEARCH_LOG_ARRAY.add(TestConstants.MOCK_SEARCH_LOG);
		TestConstants.MOCK_SEARCH_LOG_ARRAY.add(TestConstants.MOCK_SEARCH_LOG2);
		Mockito.when(repository.findAll()).thenReturn(TestConstants.MOCK_SEARCH_LOG_ARRAY);
		assertEquals(TestConstants.MOCK_SEARCH_LOG_ARRAY, service.getSearchLogs());
		Mockito.verify(repository).findAll();
	}
}
