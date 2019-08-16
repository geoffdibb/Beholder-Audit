package com.bae.service;

import java.util.List;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.entity.SearchLog;
import com.bae.repository.SearchLogRepository;

	@RunWith(SpringRunner.class)
	@SpringBootTest
public class SearchLogServiceTest {


		@InjectMocks
		SearchLogServiceImpl service;

		@Mock
		SearchLogRepository repository;

		public static SearchLog MOCK_USER_OBJECT = new SearchLog();
		public static final SearchLog MOCK_USER_OBJECT2 = new SearchLog();

		@Test
		public void getAllUsersTest() {
			List<SearchLog> MOCK_USER_ARRAY = new ArrayList<>();
			MOCK_USER_ARRAY.add(MOCK_USER_OBJECT);
			MOCK_USER_ARRAY.add(MOCK_USER_OBJECT2);
			Mockito.when(repository.findAll()).thenReturn(MOCK_USER_ARRAY);
			assertEquals(MOCK_USER_ARRAY, service.getAllLogs());
			Mockito.verify(repository).findAll();
		}
	}

