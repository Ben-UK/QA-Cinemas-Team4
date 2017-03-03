package com.qa.cinema.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.cinema.service.BookingService;

@Path("/booking")
public class BookingEndpoint {

	@Inject
	private BookingService bookingService;

	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String listAllBookings() {
		return bookingService.listAllBookings();

	}

	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String createBooking(String bookingJson) {
		return bookingService.createBooking(bookingJson);

	}

	@PUT
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String updateBooking(@PathParam("id") Long bookingID, String bookingJSON) {
		return bookingService.updateBooking(bookingID, bookingJSON);

	}

	@DELETE
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String deleteBooking(@PathParam("id") Long bookingID) {
		return bookingService.deleteBooking(bookingID);
	}

}
