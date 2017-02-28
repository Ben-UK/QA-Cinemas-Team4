package com.qa.cinema.service;

import java.util.Collection;
import java.util.Iterator;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import com.qa.cinema.persistence.Booking;
import com.qa.cinema.persistence.Ticket;
import com.qa.cinema.rest.BookingEndpoint;
import com.qa.cinema.util.JSONUtil;

@Stateless
@Default
public class DBBookingService implements BookingService {
	
	//private static final Logger LOGGER = Logger.getLogger(DBBookingService.class);
	
	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	@Inject
	private JSONUtil util;
	
	@SuppressWarnings("unchecked")
	@Override
	public String listAllBookings(){
		Query query = em.createQuery("SELECT b FROM Booking b");
		Collection<Booking> bookings = (Collection<Booking>) query.getResultList();
		return util.getJSONForObject(bookings);
		
	}
	@Override
	public String createBooking(String bookingJson){
		//LOGGER.info("In class DBBookingService method the value of bookingJson is " + bookingJson);
		Booking newBooking = util.getObjectForJSON(bookingJson, Booking.class);
		//LOGGER.info("In class DBBookingService method the value of newBooking is " + newBooking.getShowing().);
		em.persist(newBooking);
		return bookingJson;
	}
	@Override
	public String updateBooking(Long bookingID, String updateBooking){
	Booking updatedBooking = util.getObjectForJSON(updateBooking, Booking.class);
	Booking booking = findBooking(new Long(bookingID));
	if (booking != null){
		booking = updatedBooking;
		em.merge(booking);
	}
	return "{\"message\": \"booking successfully updated\"}";
	}
	@Override
	public String deleteBooking(Long bookingID){
		Booking booking = findBooking(new Long(bookingID));
		if (booking != null){
			em.remove(booking);
		}
		return "{\"message\": \"booking successfully removed\"}";
		}
	@Override
	public String deleteTicketFromBooking(Long ticketID){
		Ticket ticket = findTicket(new Long(ticketID));
		if (ticket != null){
			em.remove(ticket);
		}
		return "{\"message\": \"ticket successfully removed\"}";
				
		}
	private Booking findBooking(Long bookingID){
		Booking booking = em.find(Booking.class, bookingID);
		return booking;
		
	}
	private Ticket findTicket(Long ticketID){
		Ticket ticket = em.find(Ticket.class, ticketID);
		return ticket;
		
	}

	}
