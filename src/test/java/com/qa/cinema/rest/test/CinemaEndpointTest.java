package com.qa.cinema.rest.test;

import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import com.qa.cinema.rest.CinemaEndPoint;
import com.qa.cinema.service.CinemaService;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class CinemaEndpointTest {

	@InjectMocks
	private CinemaEndPoint subject;
	
	private static final String MOCKSTRING = "[{\"cinemaID\": 1, \"location\": Darlington}]";
	
	private static final String MOCK_DELETE_MESSAGE = "{\"message\": \"cinema sucessfully removed\"}";

	@Mock
	private CinemaService cinemaService;
	
	@Test
	public void testGetAllCinemasAreReturnedCorrectly() {
		Mockito.when(cinemaService.getAllCinemas()).thenReturn(MOCKSTRING);
		String cinemaString = subject.getCinemaAsJson();
		Mockito.verify(cinemaService).getAllCinemas();
		Assert.assertEquals(MOCKSTRING, cinemaString);
	}

	@Test
	public void testCreateCinemaCallsServiceWithGivenCinema() {
		Mockito.when(cinemaService.createCinema(MOCKSTRING)).thenReturn(MOCKSTRING);
		String cinemaString = subject.addNewCinemaToFranchise(MOCKSTRING);
		Mockito.verify(cinemaService).createCinema(MOCKSTRING);
		Assert.assertEquals(MOCKSTRING, cinemaString);
	}
	
	@Test
	public void testUpdateCinemaCallsUpdateServiceWithGivenCinemaIdAndCinema() {
		Mockito.when(cinemaService.updateCinema(new Long(1),MOCKSTRING)).thenReturn(MOCKSTRING);
		String cinemaString = subject.updateCinemaFromFranchise(new Long(1), MOCKSTRING);
		Mockito.verify(cinemaService).updateCinema(new Long(1), MOCKSTRING);
		Assert.assertEquals(MOCKSTRING, cinemaString);
	}
	
	@Test
	public void testDeleteCinemaCallsDeleteServiceWithGivenCinemaId() {
		Mockito.when(cinemaService.deleteCinema(new Long(1))).thenReturn(MOCKSTRING);
		String deleteMessage = subject.deleteCinemaFromFranchise(new Long(1));
		Mockito.verify(cinemaService).deleteCinema(new Long(1));
		Assert.assertEquals(MOCK_DELETE_MESSAGE, deleteMessage);
	}

}
