package com.qa.cinema.service;

import java.util.Collection;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.qa.cinema.persistence.Showing;
import com.qa.cinema.util.JSONUtil;


@Stateless
@Default
public class DBShowingService implements ShowingService {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Inject
	private JSONUtil util;

	@Override
	public String listAllShowings() {
		Query query = em.createQuery("SELECT e FROM Showing e");
		Collection<Showing> showings = (Collection<Showing>) query.getResultList();
		return util.getJSONForObject(showings);
	}

	@Override
	public String createShowing(String showingJson) {
		Showing newShowing = util.getObjectForJSON(showingJson, Showing.class);
		em.persist(newShowing);
		return showingJson;
	}

	@Override
	public String updateShowing(Long showingId, String updatedShowing) {
		Showing updateShowing = util.getObjectForJSON(updatedShowing, Showing.class);
		Showing showing = findShowing(new Long(showingId));
		if (showing != null) {
			showing = updateShowing;
			em.merge(showing);
		}
		return "{\"message\": \"Showing sucessfully updated\"}";
	}

	@Override
	public String deleteShowing(Long showingId) {
		Showing showing = findShowing(new Long(showingId));
		if (showing != null) {
			em.remove(showing);
		}
		return "{\"message\": \"Showing Sucessfully Removed\"}";
	}

	private Showing findShowing(Long ID) {
		return em.find(Showing.class, ID);
	}

}

