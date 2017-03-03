package com.qa.cinema.persistence.test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.qa.cinema.persistence.Booking;
import com.qa.cinema.persistence.Event;
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
    public void testGetAndSetSeatCount() {
	Showing showing = new Showing();
	showing.setSeatCount(100);
	int assertion = showing.getSeatCount();
	assertEquals(assertion, 100);
    }

    @Test
    public void testSetGetBookings() {
	Showing showing = new Showing();
	Set<Booking> bookingSet = new HashSet<Booking>();
	showing.setBookings(bookingSet);
	Set<Booking> assertion = showing.getBookings();
	assertEquals(assertion, bookingSet);
    }

    @Test
    public void testSetGetCinema() {
	Showing showing = new Showing();
	showing.setCinema(new Long(1));
	Long assertion = showing.getCinema();
	assertEquals(assertion, new Long(1));
    }

    @Test
    public void testSetEventAndGetEvent() {
	Showing showing = new Showing();
	Event event = new Event();
	showing.setEvent(event);
	Event assertion = showing.getEvent();
	assertEquals(assertion, event);
    }

}
