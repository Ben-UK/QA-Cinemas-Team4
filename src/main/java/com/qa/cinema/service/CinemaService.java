package com.qa.cinema.service;

public interface CinemaService {

	String listAllCinemas();

	String createCinema(String cinema);

	String updateCinema(Long cinemaID, String cinema);

	String deleteCinema(Long cinemaID);

}
