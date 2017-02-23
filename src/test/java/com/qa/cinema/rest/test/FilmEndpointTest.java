package com.qa.cinema.rest.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.rest.FilmEndpoint;
import com.qa.cinema.service.FilmService;

@RunWith(MockitoJUnitRunner.class)
public class FilmEndpointTest {
	
	@InjectMocks
	private FilmEndpoint filmEndpoint;
	
	private static final String MOCKSTRING = "[{\"filmID\": 1,\"certification\": \"12A\",\"description\": \"Test\",\"releaseDate\": \" 19901212 \",\"title\": \"test1\"}]";

	private static final String MOCK_DELETE_MESSAGE = "{\"message\": \"film sucessfully removed\"}";
		
	@Mock
	private FilmService mockService;
	
	@Test
	public void testListAllFilms() {
		Mockito.when(mockService.listAllFilms()).thenReturn(MOCKSTRING);
		String filmString = filmEndpoint.listAllFilms();
		Mockito.verify(mockService).listAllFilms();
		assertEquals(MOCKSTRING, filmString);
	}
	
	@Test
	public void testCreateNewFilm() {
		Mockito.when(mockService.createNewFilm(MOCKSTRING)).thenReturn(MOCKSTRING);
		String filmString = filmEndpoint.createNewFilm(MOCKSTRING);
		Mockito.verify(mockService).createNewFilm(MOCKSTRING);
		assertEquals(MOCKSTRING, filmString);
	}
	
	@Test
	public void testUpdateFilm() {
		Mockito.when(mockService.updateFilm(new Long(1),MOCKSTRING)).thenReturn(MOCKSTRING);
		String filmString = filmEndpoint.updateFilm(new Long(1),MOCKSTRING);
		Mockito.verify(mockService).updateFilm(new Long(1),MOCKSTRING);
		assertEquals(MOCKSTRING, filmString);
	}
	
	@Test
	public void testDeleteFilm() {
		Mockito.when(mockService.deleteFilm(new Long(1))).thenReturn(MOCKSTRING);
		String filmString = filmEndpoint.deleteFilm(new Long(1));
		Mockito.verify(mockService).deleteFilm(new Long(1));
		assertEquals(MOCKSTRING, filmString);
	}

}
