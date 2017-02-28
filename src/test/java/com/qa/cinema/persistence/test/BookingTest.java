package com.qa.cinema.persistence.test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.qa.cinema.persistence.Booking;
import com.qa.cinema.persistence.Showing;
import com.qa.cinema.persistence.Ticket;

public class BookingTest {

	@Test
	public void testSetGetBookingID() {
		Booking booking = new Booking();
		booking.setBookingID(new Long(0));
		Long id = booking.getBookingID();
		assertEquals(id,new Long(0));
	}
//
//	@Test
//	public void testSetGetShowing(){
//		Showing showing = new Showing();
//		Booking booking = new Booking();
//		showing.setShowingID(new Long(1));
//		booking.setShowing(showing);
//		assertEquals(booking.getShowing().getShowingID().longValue(),new Long(1).longValue());
//		
//	}
//	
//	@Test
//	public void testSetGetTickets(){
//		Ticket ticket = new Ticket();
//		Set<Ticket> tickets = new HashSet<Ticket>();
//		tickets.add(ticket);
//		Booking booking = new Booking();
//		booking.setTickets(tickets);
//		Set<Ticket> returnedTickets = booking.getTickets();
//		assertEquals(returnedTickets, tickets);
//		
//	}
//	
//	@Test
//	public void testAddTicket(){
//		Ticket ticket = new Ticket();
//		Booking booking = new Booking();
//		booking.addTicket(ticket);
//		Set<Ticket> returnedTickets = booking.getTickets();
//		boolean ticketExists = returnedTickets.contains(ticket);
//		assertEquals(ticketExists, true);
//		assertEquals(booking.getTickets().size(), 1);
//	}
//	
//	@Test 
//	public void testRemoveTicket(){
//		Ticket ticket = new Ticket();
//		Booking booking = new Booking();
//		booking.addTicket(ticket);
//		booking.removeTicket(ticket);
//		Set<Ticket> returnedTickets = booking.getTickets();
//		boolean ticketExists = returnedTickets.contains(ticket);
//		assertEquals(ticketExists, false);
//		
//	}
}
