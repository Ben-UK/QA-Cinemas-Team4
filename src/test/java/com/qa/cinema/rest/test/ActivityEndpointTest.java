package com.qa.cinema.rest.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.rest.ActivityEndpoint;
import com.qa.cinema.service.ActivityService;

@RunWith(MockitoJUnitRunner.class)
public class ActivityEndpointTest {
	
	@InjectMocks
	private ActivityEndpoint subject;
	
	private static final String MOCKSTRING = "[{\"activityID\": 1,\"title\": \"testTitle\",\"description\": \"testDescription\",\"releaseDate\": \"19901212\",\"certification\": \"18\"}]";
	private static final String MOCK_DELETE_MESSAGE = "{\"message\": \"Activity sucessfully removed\"}";
	
	@Mock
	private ActivityService mockService;
			
	@Test
	public void testlistAllActivities() {
		Mockito.when(mockService.listAllActivities()).thenReturn(MOCKSTRING);
		String activityString = subject.listAllActivitiesAsJSON();
		Mockito.verify(mockService).listAllActivities();
		Assert.assertEquals(MOCKSTRING, activityString);	
	}
	
	@Test
	public void testcreateActivity() {
		Mockito.when(mockService.createActivity(MOCKSTRING)).thenReturn(MOCKSTRING);	
		String activityString = subject.createActivityAsJSON(MOCKSTRING);
		Mockito.verify(mockService).createActivity(MOCKSTRING);
		Assert.assertEquals(MOCKSTRING, activityString);		
	}
	
	@Test
	public void testupdateActivity() {
		Mockito.when(mockService.updateActivity((long) 1, MOCKSTRING)).thenReturn(MOCKSTRING);
		String activityString = subject.updateActivityAsJSON((long) 1, MOCKSTRING);
		Mockito.verify(mockService).updateActivity((long) 1, MOCKSTRING);
		Assert.assertEquals(MOCKSTRING, activityString);	
	}
	
	@Test
	public void testdeleteActivity() {
		Mockito.when(mockService.deleteActivity(Mockito.anyLong())).thenReturn(MOCK_DELETE_MESSAGE);
		String activityString = subject.deleteActivityAsJSON((long) 1);
		Mockito.verify(mockService).deleteActivity((long) 1);
		Assert.assertEquals(MOCK_DELETE_MESSAGE, activityString);	
	}

}
