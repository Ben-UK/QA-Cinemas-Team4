package com.qa.cinema.service;

public interface BookingService {
	
	String listAllBookings();
	
	String createBooking(String booking);

	String updateBooking(Long bookingID, String booking);

	String deleteBooking(Long bookingID);

	String deleteTicketFromBooking(Long ticketID);

}
