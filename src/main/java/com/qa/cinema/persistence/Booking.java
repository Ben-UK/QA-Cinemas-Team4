package com.qa.cinema.persistence;

import java.io.Serializable;
import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;


/**
 * The persistent class for the booking database table.
 * 
 */
@Entity
@NamedQuery(name="Booking.findAll", query="SELECT b FROM Booking b")
public class Booking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long bookingID;

	//bi-directional many-to-one association to Showing
	@ManyToOne
	private Showing showing;

	//bi-directional many-to-one association to Ticket
	@OneToMany(mappedBy="booking")
	private Set<Ticket> tickets;

	public Booking() {
		this.tickets = new HashSet<Ticket>();
	}
	
	public Booking(Showing showing) {
		this.showing = showing;
		this.tickets = new HashSet<Ticket>();
	}

	public Long getBookingID() {
		return this.bookingID;
	}

	public void setBookingID(Long bookingID) {
		this.bookingID = bookingID;
	}

	public Showing getShowing() {
		return this.showing;
	}

	public void setShowing(Showing showing) {
		this.showing = showing;
	}

	public Set<Ticket> getTickets() {
		return this.tickets;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Ticket addTicket(Ticket ticket) {
		getTickets().add(ticket);
		ticket.setBooking(this);

		return ticket;
	}

	public Ticket removeTicket(Ticket ticket) {
		getTickets().remove(ticket);
		ticket.setBooking(null);

		return ticket;
	}

}