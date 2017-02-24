package com.qa.cinema.rest.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.rest.ShowingEndpoint;
import com.qa.cinema.service.ShowingService;

@RunWith(MockitoJUnitRunner.class)

public class ShowingEndpointTest {

	@InjectMocks
	private ShowingEndpoint subject;

	private static final String MOCKSTRING = "[{\"id\": 1,\"activityID\": \"null\",\"filmID\": \1,\"cinemaID\": 1,\"Calendar\": \"01012018 20:00\",\"seatcount\": 200}]";

	private static final String MOCK_DELETE_MESSAGE = "{\"message\": \"showing sucessfully removed\"}";

	@Mock
	private ShowingService mockService;

	@Test
	public void testListAllShowingsAreReturnedCorrectly() {
		Mockito.when(mockService.listAllShowings()).thenReturn(MOCKSTRING);
		String showingString = subject.listAllShowings();
		Mockito.verify(mockService).listAllShowings();
		Assert.assertEquals(MOCKSTRING, showingString);
	}

	@Test
	public void testAddShowingCallsServiceWithGivenShowing() {
		Mockito.when(mockService.createShowing(MOCKSTRING)).thenReturn(MOCKSTRING);
		String showingString = subject.createShowing(MOCKSTRING);
		Mockito.verify(mockService).createShowing(MOCKSTRING);
		Assert.assertEquals(MOCKSTRING, showingString);
	}

	@Test
	public void testDeleteShowingCallsDeleteServiceWithGivenID() {

		Mockito.when(mockService.deleteShowing(Mockito.anyLong())).thenReturn(MOCK_DELETE_MESSAGE);
		String deleteMessage = subject.deleteShowing(1L);
		Mockito.verify(mockService).deleteShowing(1L);
		Assert.assertEquals(MOCK_DELETE_MESSAGE, deleteMessage);
	}

	@Test
	public void testReplaceShowingCallsEditServiceWithGivenShowingAndID() {
		Mockito.when(mockService.updateShowing(1L, MOCKSTRING)).thenReturn(MOCKSTRING);
		String showingString = subject.updateShowing(1L, MOCKSTRING);
		Mockito.verify(mockService).updateShowing(1L, MOCKSTRING);
		Assert.assertEquals(MOCKSTRING, showingString);
	}

}

