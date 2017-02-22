package com.qa.cinema.service.test;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

import com.qa.cinema.persistence.Film;
import com.qa.cinema.service.MapFilmService;
import com.qa.cinema.util.JSONUtil;
import com.qa.cinema.util.JSONUtil.*;

public class MapFilmServiceTest {
	
	MapFilmService filmService;
	
	JSONUtil util;
	
	@SuppressWarnings("unchecked")
	@Test
	public void testListAllFilms() {
		filmService = new MapFilmService();
		filmService.createNewFilm("test"); //date as string
		String returnedFilmMap = filmService.listAllFilms();
		Map<Long,Film> filmMap = util.getObjectForJSON(returnedFilmMap, Map.class);
		Film mapFilm = filmMap.get(0);
		assertEquals("test",mapFilm.getTitle());
	}
	
	@Test
	public void testCreateNewFilm() {
		filmService = new MapFilmService();
		filmService.createNewFilm("test"); //date as string
		assertEquals("test",mapFilm.getTitle());
	}

}
