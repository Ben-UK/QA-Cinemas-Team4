package com.qa.cinema.service;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.cinema.persistence.Film;
import com.qa.cinema.util.JSONUtil;

@Stateless
@Default
public class DBFilmService implements FilmService {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	@Inject
	private JSONUtil util;

	@SuppressWarnings("unchecked")
	@Override
	public String listAllFilms() {
		Query query = em.createQuery("SELECT f FROM Film f");
		Collection<Film> films = (Collection<Film>) query.getResultList();
		return util.getJSONForObject(films);
	}

	@Override
	public String createNewFilm(String filmJSON) {
		Film newFilm = util.getObjectForJSON(filmJSON, Film.class);
		em.persist(newFilm);
		return "{\"message\": \"film sucessfully created\"}";
	}

	@Override
	public String updateFilm(Long filmID, String filmJSON) {
		Film updateFilm = util.getObjectForJSON(filmJSON, Film.class);
		Film filmInDB = findFilm(new Long(filmID));
		if (filmInDB != null) {
			filmInDB = updateFilm;
			em.merge(filmInDB);
		}
		return  "{\"message\": \"film sucessfully updated\"}";
	}

	@Override
	public String deleteFilm(Long filmID) {
		Film filmInDB = findFilm(new Long(filmID));
		if (filmInDB != null) {
			em.remove(filmInDB);
		}
		return  "{\"message\": \"film sucessfully deleted\"}";
	}
	
	private Film findFilm(Long filmID) {
		return em.find(Film.class, filmID);
	}
}
