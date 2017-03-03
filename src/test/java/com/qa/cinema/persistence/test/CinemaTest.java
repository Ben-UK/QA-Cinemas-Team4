package com.qa.cinema.persistence.test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.qa.cinema.persistence.Cinema;
import com.qa.cinema.persistence.Showing;

public class CinemaTest {

    @Test
    public void testSetGetLocation() {
	Cinema newCinema = new Cinema();
	newCinema.setLocation("Darlington");
	assertEquals("Darlington", newCinema.getLocation());
    }

    @Test
    public void testGetCinemaID() {
	Cinema cinema = new Cinema();
	cinema.setCinemaID(new Long(1));
	Long assetion = cinema.getCinemaID();
	assertEquals(assetion, new Long(1));
    }

    @Test
    public void testSetCinemaID() {
	Cinema cinema = new Cinema();
	cinema.setCinemaID(new Long(2));
	Long assetion = cinema.getCinemaID();
	assertEquals(assetion, new Long(2));
    }

    @Test
    public void testSetShowingsAndGetShowings() {
	Cinema cinema = new Cinema();
	Showing showing = new Showing();
	Set<Showing> showingList = new HashSet<Showing>();
	showingList.add(showing);
	cinema.setShowings(showingList);
	Set<Showing> testList = cinema.getShowings();
	assertEquals(testList, showingList);
    }
}
