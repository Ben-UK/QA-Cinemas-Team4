package com.qa.cinema.persistence;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@NamedQuery(name = "Ticket.findAll", query = "SELECT t FROM Ticket t")
public class Ticket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ticketID")
	private Long ticketID;

	@Column(name = "ticketType")
	private String ticketType;

	@Column(name = "tickets_bookingID")
	private Long bookingID;

	public Ticket() {
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

	public Long getBookingID() {
		return bookingID;
	}

	public void setBookingID(Long bookingID) {
		this.bookingID = bookingID;
	}

}