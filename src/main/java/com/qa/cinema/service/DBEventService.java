package com.qa.cinema.service;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.cinema.persistence.Event;
import com.qa.cinema.util.JSONUtil;

@Stateless
@Default
public class DBEventService implements EventService {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Inject
	private JSONUtil util;

	@SuppressWarnings("unchecked")
	@Override
	public String listAllEvent() {
		Query query = em.createQuery("SELECT f FROM Event f");
		Collection<Event> event = (Collection<Event>) query.getResultList();
		return util.getJSONForObject(event);
	}

	@Override
	public String createNewEvent(String eventJSON) {
		Event newEvent = util.getObjectForJSON(eventJSON, Event.class);
		em.persist(newEvent);
		return "{\"message\": \" event sucessfully created\"}";
	}

	@Override
	public String updateEvent(Long eventID, String eventJSON) {
		Event updateEvent = util.getObjectForJSON(eventJSON, Event.class);
		Event eventInDB = findEvent(new Long(eventID));
		if (eventInDB != null) {
			eventInDB = updateEvent;
			em.merge(eventInDB);
		}
		return "{\"message\": \" event sucessfully updated\"}";
	}

	@Override
	public String deleteEvent(Long eventID) {
		Event eventInDB = findEvent(new Long(eventID));
		if (eventInDB != null) {
			em.remove(eventInDB);
		}
		return "{\"message\": \" event sucessfully deleted\"}";
	}

	private Event findEvent(Long eventID) {
		return em.find(Event.class, eventID);
	}
}
