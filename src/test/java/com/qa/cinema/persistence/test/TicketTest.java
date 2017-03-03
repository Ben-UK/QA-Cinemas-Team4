package com.qa.cinema.persistence.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.cinema.persistence.Ticket;

public class TicketTest {

    @Test
    public void testGetAndSetTicketID() {
	Ticket ticket = new Ticket();
	ticket.setTicketID(new Long(1));
	Long assertion = ticket.getTicketID();
	assertEquals(assertion, new Long(1));
    }

    @Test
    public void testGetAndSetTicketType() {
	Ticket ticket = new Ticket();
	ticket.setTicketType("adult");
	String assertion = ticket.getTicketType();
	assertEquals(assertion, "adult");
    }

    @Test
    public void testGetAndSetBookingID() {
	Ticket ticket = new Ticket();
	ticket.setBookingID(new Long(1));
	Long assertion = ticket.getBookingID();
	assertEquals(assertion, new Long(1));
    }

}
