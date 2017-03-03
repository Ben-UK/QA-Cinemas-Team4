package com.qa.cinema.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.cinema.service.EventService;

@Path("/event")
public class EventEndpoint {

	@Inject
	private EventService eventService;

	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String listAllEvent() {
		return eventService.listAllEvent();
	}

	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String createNewEvent(String eventJSON) {
		return eventService.createNewEvent(eventJSON);
	}

	@PUT
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String updateEvent(@PathParam("id") Long eventID, String eventJSON) {
		return eventService.updateEvent(eventID, eventJSON);
	}

	@DELETE
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String deleteEvent(@PathParam("id") Long eventID) {
		return eventService.deleteEvent(eventID);
	}

}
