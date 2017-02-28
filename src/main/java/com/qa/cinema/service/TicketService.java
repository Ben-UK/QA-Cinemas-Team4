package com.qa.cinema.service;

public interface TicketService {

	//String showTicket(Long ticketID);
	String showTicket();

	String createNewTicket(String ticket);

	String updateTicket(Long ticketID, String ticket);

	String deleteTicket(Long ticketID);

}
