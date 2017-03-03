package com.qa.cinema.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

@Entity
@NamedQuery(name = "Showing.findAll", query = "SELECT s FROM Showing s")
public class Showing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long showingID;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dateTime;

	@Column(name = "seatCount")
	private int seatCount;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "bookings_showingID")
	private Set<Booking> bookings = new HashSet<Booking>();

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "event_showingID")
	private Event event;

	@Column(name = "showing_cinemaID")
	private Long cinema;

	public Showing() {

	}

	public Long getShowingID() {
		return this.showingID;
	}

	public void setShowingID(Long showingID) {
		this.showingID = showingID;
	}

	public Calendar getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Calendar dateTime) {
		this.dateTime = dateTime;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public Long getCinema() {
		return this.cinema;
	}

	public void setCinema(Long cinemaID) {
		this.cinema = cinemaID;
	}

	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Set<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

}