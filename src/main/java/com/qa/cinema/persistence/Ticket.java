package com.qa.cinema.persistence;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Cascade;


/**
 * The persistent class for the ticket database table.
 * 
 */
@Entity
@NamedQuery(name = "Ticket.findAll", query = "SELECT t FROM Ticket t")
public class Ticket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long ticketID;

	private String ticketType;

	// bi-directional many-to-one association to Booking
//	@ManyToOne(cascade = CascadeType.ALL)
//	private Booking booking;

	public Ticket() {
	}

	public Ticket(String ticketType) {
		this.ticketType = ticketType;
	}

	public Long getTicketID() {
		return this.ticketID;
	}

	public void setTicketID(Long ticketID) {
		this.ticketID = ticketID;
	}

	public String getTicketType() {
		return this.ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

//	public Booking getBooking() {
//		return this.booking;
//	}
//
//	public void setBooking(Booking booking) {
//		this.booking = booking;
//	}

}