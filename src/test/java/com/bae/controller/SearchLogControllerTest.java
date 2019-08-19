package com.bae.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.service.SearchLogServiceImpl;
import com.bae.util.TestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchLogControllerTest {

	@InjectMocks
	SearchLogController controller;

	@Mock
	SearchLogServiceImpl service;

	@Test
	public void getAllUsersTest() {
		TestConstants.MOCK_SEARCH_LOG_ARRAY.add(TestConstants.MOCK_SEARCH_LOG);
		TestConstants.MOCK_SEARCH_LOG_ARRAY.add(TestConstants.MOCK_SEARCH_LOG2);
		Mockito.when(service.getAllLogs()).thenReturn(TestConstants.MOCK_SEARCH_LOG_ARRAY);
		assertEquals(TestConstants.MOCK_SEARCH_LOG_ARRAY, controller.getAllLogs());
		Mockito.verify(service).getAllLogs();
	}
}
