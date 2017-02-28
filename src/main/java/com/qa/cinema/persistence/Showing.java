package com.qa.cinema.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;


/**
 * The persistent class for the showing database table.
 * 
 */
@Entity
@NamedQuery(name="Showing.findAll", query="SELECT s FROM Showing s")
public class Showing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long showingID;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dateTime;

	@Column(name="SEAT_COUNT")
	private static int seatCount = 100;

	//bi-directional many-to-one association to Booking
//	@OneToMany(mappedBy="showing")
	//private Set<Booking> bookings = new HashSet<Booking>();

	//bi-directional many-to-one association to Activity
	@ManyToOne
	private Activity activity;

	//bi-directional many-to-one association to Cinema
	@ManyToOne
	private Cinema cinema;

	//bi-directional many-to-one association to Film
	@ManyToOne
	private Film film;

	public Showing() {
		//this.bookings = new HashSet<Booking>();
	}
	
	public Showing(Calendar dateTime,Activity activity, 
			Cinema cinema, Film film){
		this.dateTime = dateTime;
		//this.bookings = new HashSet<Booking>();
		this.activity = activity;
		this.cinema = cinema;
		this.film = film;
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

//	public Set<Booking> getBookings() {
//		return this.bookings;
//	}
//
//	public void setBookings(Set<Booking> bookings) {
//		this.bookings = bookings;
//	}

//	public Booking addBooking(Booking booking) {
//		getBookings().add(booking);
//		booking.setShowing(this);
//
//		return booking;
//	}
//
//	public Booking removeBooking(Booking booking) {
//		getBookings().remove(booking);
//		booking.setShowing(null);
//
//		return booking;
//	}

	public Activity getActivity() {
		return this.activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public Cinema getCinema() {
		return this.cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public Film getFilm() {
		return this.film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

}