package com.qa.cinema.persistence.test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.qa.cinema.persistence.Film;
import com.qa.cinema.persistence.Showing;

public class FilmTest {

	@Test
	public void testSetGetFilmID() {
		Calendar c = Calendar.getInstance();
		c.set(2012,7,21);
		Film film = new Film("12A","Wizards",c,"Harry Potter");
		film.setFilmID(new Long(0));
		Long id = film.getFilmID();
		assertEquals(id,new Long(0));
	}
	
	@Test
	public void testSetGetCertification() {
		Film film = new Film();
		film.setCertification("12A");
		String certification = film.getCertification();
		assertEquals(certification,"12A");
	}
	
	@Test
	public void testSetGetDescription() {
		Film film = new Film();
		film.setDescription("Wizards");
		String description = film.getDescription();
		assertEquals(description,"Wizards");
	}
	
	@Test
	public void testSetGetReleaseDate() {
		Film film = new Film();
		Calendar newReleaseDate = Calendar.getInstance();
		newReleaseDate.set(2012,7,21);
		film.setReleaseDate(newReleaseDate);
		Calendar releaseDate = film.getReleaseDate();
		assertEquals(releaseDate,newReleaseDate);
	}
}
