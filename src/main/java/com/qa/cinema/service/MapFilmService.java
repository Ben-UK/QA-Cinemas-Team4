package com.qa.cinema.service;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.cinema.persistence.Film;
import com.qa.cinema.util.JSONUtil;

@ApplicationScoped
@Alternative
public class MapFilmService implements FilmService {
	
	//private static final Logger LOGGER = Logger.getLogger(MapFilmService.class);
	private final long INITIAL_COUNT = 1;
	private Map<Long, Film> filmMap;
	private long ID;
	
	@Inject 
	private JSONUtil util;
	
	public MapFilmService() {
		this.filmMap = new HashMap<Long, Film>();
		//ID = INITIAL_COUNT;
		//initFilmService();
	}

	@Override
	public String listAllFilms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createNewFilm(String film) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateFilm(Long filmID, String film) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteFilm(Long filmID) {
		// TODO Auto-generated method stub
		return null;
	}

}
