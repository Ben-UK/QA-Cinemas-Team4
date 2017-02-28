package com.qa.cinema.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.cinema.service.CinemaService;

@Path("/cinema")
public class CinemaEndPoint {

	@Inject
	private CinemaService cinemaService;
	
	@GET
	@Path("/json")
	@Produces({"application/json"})
	public String getCinemaAsJson(){
		return cinemaService.listAllCinemas();
	}
//	
//	@GET
//	@Path("/json")
//	@Produces({"application/json"})
//	public String getAllCurrentlyShowingFilmsAsJson(){
//		return cinemaService.getAllCurrentlyShowingFilms();
//	}
//	
//	@GET
//	@Path("/json")
//	@Produces({"application/json"})
//	public String getAllCurrentlyShowingActivitiesAsJson(){
//		return cinemaService.getAllCurrentlyShowingActivities();
//	}
//	
//	@GET
//	@Path("/json")
//	@Produces({"application/json"})
//	public String getAllFutureReleasesAsJson(){
//		return cinemaService.getAllFutureReleases();
//	}
	
	@POST
	@Path("/json")
	@Produces({"application/json"})
	public String addNewCinemaToFranchise(String cinemaLocation){
		return cinemaService.createCinema(cinemaLocation);
	}
	
	@PUT
	@Path("/json/{id}")
	@Produces({"application/json"})
	public String updateCinemaFromFranchise(@PathParam("id") Long cinemaID, String cinemaLocation){
		return cinemaService.updateCinema(cinemaID, cinemaLocation);
	}
	
	@DELETE
	@Path("/json/{id}")
	@Produces({"application/json"})
	public String deleteCinemaFromFranchise(@PathParam("id") Long showingID){
		return cinemaService.deleteCinema(showingID);
	}
	
	
	
}
