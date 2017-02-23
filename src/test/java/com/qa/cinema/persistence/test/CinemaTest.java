package com.qa.cinema.persistence.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.cinema.persistence.Cinema;

public class CinemaTest {

	@Test
	public void testSetGetLocation() {
		Cinema newCinema = new Cinema("Darlington");
		assertEquals("Darlington",newCinema.getLocation());
	}

}
