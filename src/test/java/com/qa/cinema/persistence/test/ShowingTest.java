package com.qa.cinema.persistence.test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.qa.cinema.persistence.Activity;
import com.qa.cinema.persistence.Booking;
import com.qa.cinema.persistence.Cinema;
import com.qa.cinema.persistence.Film;
import com.qa.cinema.persistence.Showing;

public class ShowingTest {

	@Test
	public void testSetGetShowingID() {
		Showing showing = new Showing();
		showing.setShowingID(new Long(1));
		Long assertion = showing.getShowingID();
		assertEquals(assertion, new Long(1));
	}

	@Test
	public void testSetGetDateTime() {
		Calendar c = new GregorianCalendar();
		c.set(2017, 1, 01, 12, 30);
		Showing showing = new Showing();
		showing.setDateTime(c);
		Calendar assertion = showing.getDateTime();
		assertEquals(assertion, c);
	}

	@Test
	public void testGetSeatCount() {
		Showing showing = new Showing();
		int assertion = showing.getSeatCount();
		assertEquals(assertion, 100);
	}

//	@Test
//	public void testSetGetBookings() {
//		Showing showing = new Showing();
//		Set<Booking> bookingSet = new HashSet<Booking>();
//		showing.setBookings(bookingSet);
//		Set<Booking> assertion = showing.getBookings();
//		assertEquals(assertion, bookingSet);
//	}
//
//	@Test
//	public void testAddBookings() {
//		Showing showing = new Showing();
//		Booking booking = new Booking();
//		showing.addBooking(booking);
//		Set<Booking> bookingSet = showing.getBookings();
//		boolean bookingExists = bookingSet.contains(booking);
//		assertEquals(bookingExists, true);
//	}
//
//	@Test
//	public void testRemoveBookings() {
//		Showing showing = new Showing();
//		Booking booking = new Booking();
//		showing.addBooking(booking);
//		showing.removeBooking(booking);
//		Set<Booking> bookingSet = showing.getBookings();
//		boolean bookingExists = bookingSet.contains(booking);
//		assertEquals(bookingExists, false);
//	}

	@Test
	public void testSetGetActivity() {
		Showing showing = new Showing();
		Activity activity = new Activity();
		showing.setActivity(activity);
		Activity assertion = showing.getActivity();
		assertEquals(assertion, activity);
	}

	@Test
	public void testSetGetCinema() {
		Showing showing = new Showing();
		Cinema cinema = new Cinema();
		showing.setCinema(cinema);
		Cinema assertion = showing.getCinema();
		assertEquals(assertion, cinema);
	}

	@Test
	public void testSetGetFilm() {
		Showing showing = new Showing();
		Film film = new Film();
		showing.setFilm(film);
		Film assertion = showing.getFilm();
		assertEquals(assertion, film);
	}

}
