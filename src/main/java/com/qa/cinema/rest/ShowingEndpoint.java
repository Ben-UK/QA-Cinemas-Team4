package com.qa.cinema.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;

import com.qa.cinema.service.ShowingService;

@Path("/showing")

public class ShowingEndpoint {




	@Inject
	private ShowingService service;

	@Path("/json")
	@GET
	@Produces({ "application/json" })
	public String listAllShowings() {
		return service.listAllShowings();
	}

	@Path("/json")
	@POST
	@Produces({ "application/json" })
	public String createShowing(String showing) {
		return service.createShowing(showing);
	}

	@Path("/json/{showingid}")
	@PUT
	@Produces({ "application/json" })
	public String updateShowing(@PathParam("showingid") Long showingID, String showing) {
		return service.updateShowing(showingID, showing);
	}

	@Path("/json/{showingid}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteShowing(@PathParam("showingid") Long showingID) {
		return service.deleteShowing(showingID);
	}
}


