package com.qa.cinema.rest.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;



public class ActivityEndpointTest {
	
	@InjectMocks
	private ActivityEndPoint subject;
	
	private static final String MOCKSTRING = "[{\"activityID\": 1,\"title\": \"testTitle\",\"description\": \"testDescription\",\"releaseDate\": \"19901212\",\"certification\": \"18\"}]";
	private static final String MOCK_DELETE_MESSAGE = "{\"message\": \"Activity sucessfully removed\"}";
	
	@Mock
	private ActivityService activityService;
	
	
		
	@Test
	public void testlistAllActivities() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testcreateActivity() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testupdateActivity() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testdeleteActivity() {
		fail("Not yet implemented");
	}

}
