/*package com.qa.cinema.service.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.qa.cinema.persistence.Cinema;
import com.qa.cinema.service.MapCinemaService;

public class CinemaServiceTest {

	@Test
	public void testListAllCinemas() {
		MapCinemaService mapCinema = new MapCinemaService();
		mapCinema.createCinema("Darlington");
		mapCinema.createCinema("Edinburgh");
		
		String string = mapCinema.listAllCinemas();
		
		assertEquals(,getObjectForJSON(string));
	}
	
	@Test
	public void testCreateCinema() {
	
		MapCinemaService mapCinema = new MapCinemaService();
		mapCinema.createCinema("Darlington");
		Cinema newCinema = mapCinema.cinemaMap.get(1);
		assertEquals("Darlington",newCinema.getLocation());
	}
	
	@Test
	public void testUpdateCinema() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDeleteCinema() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testFindCinema() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetAllCurrentlyShowingFilms() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetAllCurrentlyShowingActivities() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllFutureReleases() {
		fail("Not yet implemented");
	}


}
*/