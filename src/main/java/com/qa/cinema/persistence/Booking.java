package com.qa.cinema.persistence;

import java.io.Serializable;
import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@NamedQuery(name = "Booking.findAll", query = "SELECT b FROM Booking b")
public class Booking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingID;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "tickets_bookingID")
	private Set<Ticket> tickets = new HashSet<Ticket>();

	@Column(name = "bookings_showingID")
	private Long showingID;

	public Booking() {

	}

	public Long getBookingID() {
		return this.bookingID;
	}

	public void setBookingID(Long bookingID) {
		this.bookingID = bookingID;
	}

	public Long getShowingID() {
		return showingID;
	}

	public void setShowingID(Long showingID) {
		this.showingID = showingID;
	}

	public Set<Ticket> getTicketsSet() {
		return tickets;
	}

	public void setTicketsSet(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

}