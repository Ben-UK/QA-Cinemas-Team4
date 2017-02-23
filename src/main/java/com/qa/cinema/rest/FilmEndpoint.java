package com.qa.cinema.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.cinema.service.DBFilmService;
import com.qa.cinema.service.FilmService;

@Path("/film")
public class FilmEndpoint {
	
	@Inject
	private DBFilmService filmService; //FilmService
	
	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String listAllFilms() {
		return filmService.listAllFilms();
	}
	
	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String createNewFilm(String filmJson) {
		return filmService.createNewFilm(filmJson);
	}
	
	@PUT
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String updateFilm(@PathParam("id") Long filmID, String filmJson) {
		return filmService.updateFilm(filmID,filmJson);
	}
	
	@DELETE
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String deleteFilm(@PathParam("id") Long filmID) {
		return filmService.deleteFilm(filmID);
	}

}
