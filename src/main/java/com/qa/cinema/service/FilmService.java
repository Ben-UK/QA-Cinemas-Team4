package com.qa.cinema.service;

public interface FilmService {
	
	String listAllFilms();
	
	String createNewFilm(String film);
	
	String updateFilm(Long filmID, String film);
	
	String deleteFilm(Long filmID);

}
