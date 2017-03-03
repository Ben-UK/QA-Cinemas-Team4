package com.qa.cinema.persistence.test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.qa.cinema.persistence.Booking;
import com.qa.cinema.persistence.Ticket;

public class BookingTest {

    @Test
    public void testSetGetBookingID() {
	Booking booking = new Booking();
	booking.setBookingID(new Long(0));
	Long id = booking.getBookingID();
	assertEquals(id, new Long(0));
    }

    @Test
    public void testSetGetShowingID() {
	Booking booking = new Booking();
	booking.setShowingID(new Long(1));
	Long assertion = booking.getShowingID();
	assertEquals(assertion, new Long(1));

    }

    @Test
    public void testGetTicketsSetAndSetTicketSet() {
	Ticket ticket = new Ticket();
	Booking booking = new Booking();
	Set<Ticket> ticketSet = new HashSet<Ticket>();
	ticketSet.add(ticket);
	booking.setTicketsSet(ticketSet);
	Set<Ticket> assertion = booking.getTicketsSet();
	assertEquals(assertion, ticketSet);
    }
}
