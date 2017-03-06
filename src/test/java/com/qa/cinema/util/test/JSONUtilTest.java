package com.qa.cinema.util.test;

import static org.junit.Assert.*;
import com.qa.cinema.persistence.Ticket;
import com.qa.cinema.util.JSONUtil;

import org.junit.Test;

public class JSONUtilTest {

    @Test
    public void testGetJSONForObject() {
	JSONUtil util = new JSONUtil();
	Ticket ticket = new Ticket();
	ticket.setTicketType("adult");
	String jsonString = "{\"ticketType\":\"adult\"}";
	String assertion = util.getJSONForObject(ticket);
	assertEquals(assertion, jsonString);
    }

    @Test
    public void testGetObjectForJSON() {
	JSONUtil util = new JSONUtil();
	Ticket ticket = new Ticket();
	ticket.setTicketType("adult");
	String jsonString = util.getJSONForObject(ticket);
	Ticket jsonTicket = util.getObjectForJSON(jsonString, Ticket.class);
	String assertion = jsonTicket.getTicketType();
	assertEquals(assertion, "adult");
    }

}