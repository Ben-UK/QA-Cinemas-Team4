package com.qa.cinema.service;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.cinema.persistence.Activity;
import com.qa.cinema.persistence.Cinema;
import com.qa.cinema.persistence.Film;
import com.qa.cinema.util.JSONUtil;

@Stateless
@Default
public class DBCinemaService implements CinemaService {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	@Inject
	private JSONUtil util;
	
	@Override
	public String listAllCinemas(){
		Query query = em.createQuery("SELECT c FROM CINEMA c");
		Collection<Cinema> cinemas = (Collection<Cinema>) query.getResultList();
		return util.getJSONForObject(cinemas);
	}
	
	@Override
	public String createCinema(String cinema){
		Cinema newCinema = util.getObjectForJSON(cinema, Cinema.class);
		em.persist(newCinema);
		return cinema;
	}
	
	@Override
	public String updateCinema(Long cinemaID, String updatedCinema){
		Cinema updateCinema = util.getObjectForJSON(updatedCinema, Cinema.class);
		Cinema cinema = findCinema(new Long(cinemaID));
		if (cinema != null){
			cinema = updateCinema;
			em.merge(cinema);
		}
		return "{\"message\": \"Cinema sucessfully updated\"}";
	}
	
	@Override
	public String deleteCinema(Long cinemaID){
		Cinema cinema = findCinema(new Long(cinemaID));
		if (cinema != null){
			em.remove(cinema);
		}
		return "{\"message\": \"Cinema sucessfully deleted\"}";
	}
	
	@Override
	public String getAllCurrentlyShowingFilms(){
		Query query = em.createQuery("SELECT DISTINCT r FROM CINEMA c JOIN c.showingID s JOIN s.filmID f JOIN f.releaseDate r WHERE r.realeaseDate < CONVERT(date, getDate())");
		Collection<Film> films = (Collection<Film>) query.getResultList();
		return util.getJSONForObject(films);
	}
	
	@Override
	public String getAllCurrentlyShowingActivities(){
		Query query = em.createQuery("SELECT DISTINCT r FROM CINEMA c JOIN c.showingID s JOIN s.activityID a JOIN a.releaseDate r WHERE r.realeaseDate < CONVERT(date, getDate())");
		Collection<Activity> activities = (Collection<Activity>) query.getResultList();
		return util.getJSONForObject(activities);
	}
	
	@Override
	public String getAllFutureReleases(){
		Query query = em.createQuery("SELECT DISTINCT r FROM CINEMA c JOIN c.showingID s JOIN s.filmID f JOIN f.releaseDate r WHERE r.realeaseDate > CONVERT(date, getDate())");
		Collection<Film> films = (Collection<Film>) query.getResultList();
		return util.getJSONForObject(films);
	}
	
	private Cinema findCinema(Long id){
		return em.find(Cinema.class, id);
	}
	
}
