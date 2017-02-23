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
	
	@Test
	public void testSetGetShowings() {
		Film film = new Film();
		Calendar dateTime = Calendar.getInstance();
		dateTime.set(2017, 2, 23, 12, 30);
		Showing showing1 = new Showing(); //new Showing(new Long(0), new Long(1), new Long(2), dateTime, 50);
		Set<Showing> showings = new HashSet<Showing>();
		showings.add(showing1);
		film.setShowings(showings);
		Set<Showing> returnedShowing = film.getShowings();
		assertEquals(returnedShowing, showings);
	}
	
	@Test
	public void testAddShowing() {
		Film film = new Film();
		film.setTitle("Harry Potter");
		Showing showing = new Showing();
		film.addShowing(showing);
		Film returnedFilm = showing.getFilm();
		assertEquals(film.getTitle(), returnedFilm.getTitle());
	}
	
	@Test
	public void testRemoveShowing() {
		Film film = new Film();
		film.setTitle("Harry Potter");
		Showing showing = new Showing();
		film.addShowing(showing);
		film.removeShowing(showing);
	}

}
