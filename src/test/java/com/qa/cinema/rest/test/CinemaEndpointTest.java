package com.qa.cinema.rest.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import com.qa.cinema.rest.CinemaEndPoint;
import com.qa.cinema.service.CinemaService;


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
		Mockito.when(cinemaService.listAllCinemas()).thenReturn(MOCKSTRING);
		String cinemaString = subject.getCinemaAsJson();
		Mockito.verify(cinemaService).listAllCinemas();
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
		Mockito.when(cinemaService.deleteCinema(new Long(1))).thenReturn(MOCK_DELETE_MESSAGE);
		String deleteMessage = subject.deleteCinemaFromFranchise(new Long(1));
		Mockito.verify(cinemaService).deleteCinema(new Long(1));
		Assert.assertEquals(MOCK_DELETE_MESSAGE, deleteMessage);
	}
	
	@Test
	public void testGetAllCurrentlyShowingFilmsReturnedCorrectly() {
		Mockito.when(cinemaService.getAllCurrentlyShowingFilms()).thenReturn(MOCKSTRING);
		String cinemaString = subject.getAllCurrentlyShowingFilmsAsJson();
		Mockito.verify(cinemaService).getAllCurrentlyShowingFilms();
		Assert.assertEquals(MOCKSTRING, cinemaString);
	}

	@Test
	public void testGetAllCurrentlyShowingActivitiesReturnedCorrectly() {
		Mockito.when(cinemaService.getAllCurrentlyShowingActivities()).thenReturn(MOCKSTRING);
		String cinemaString = subject.getAllCurrentlyShowingActivitiesAsJson();
		Mockito.verify(cinemaService).getAllCurrentlyShowingActivities();
		Assert.assertEquals(MOCKSTRING, cinemaString);
	}

	@Test
	public void testGetAllFutureReleasesReturnedCorrectly() {
		Mockito.when(cinemaService.getAllFutureReleases()).thenReturn(MOCKSTRING);
		String cinemaString = subject.getAllFutureReleasesAsJson();
		Mockito.verify(cinemaService).getAllFutureReleases();
		Assert.assertEquals(MOCKSTRING, cinemaString);
	}
}
