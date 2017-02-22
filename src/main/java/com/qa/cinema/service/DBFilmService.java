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
	public String createNewFilm(String film) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateFilm(Long filmID, String film) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteFilm(Long filmID) {
		// TODO Auto-generated method stub
		return null;
	}

}
