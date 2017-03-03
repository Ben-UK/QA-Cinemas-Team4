package com.qa.cinema.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.qa.cinema.service.TicketService;

@Path("/ticket")
public class TicketEndPoint {

	@Inject
	private TicketService ticketService;

	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String getTicket() {
		return ticketService.showTicket();
	}

	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String createNewTicket(String ticketJson) {
		return ticketService.createNewTicket(ticketJson);
	}

	@PUT
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String updateTicket(@PathParam("ticketID") Long id, String ticketJson) {
		return ticketService.updateTicket(id, ticketJson);
	}

	@DELETE
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String deleteTicket(@PathParam("ticketID") Long id) {
		return ticketService.deleteTicket(id);
	}

}
