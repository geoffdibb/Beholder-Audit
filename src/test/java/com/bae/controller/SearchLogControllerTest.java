package com.bae.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.service.SearchLogService;
import com.bae.service.SearchLogServiceImpl;
import com.bae.util.TestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchLogControllerTest {

	@InjectMocks
	private SearchLogController controller;

	@Mock
	private SearchLogServiceImpl service;

	@Test
	public void getAllUsersTest() {
		TestConstants.MOCK_SEARCH_LOG_ARRAY.add(TestConstants.MOCK_SEARCH_LOG);
		TestConstants.MOCK_SEARCH_LOG_ARRAY.add(TestConstants.MOCK_SEARCH_LOG2);
		Mockito.when(service.getSearchLogs()).thenReturn(TestConstants.MOCK_SEARCH_LOG_ARRAY);
		assertEquals(TestConstants.MOCK_SEARCH_LOG_ARRAY, controller.getSearchLogs());
		Mockito.verify(service).getSearchLogs();
	}

	@Test
	public void getServiceTest() {
		SearchLogService SearchLogService = service;
		assertEquals(SearchLogService, controller.getService());
	}
}
