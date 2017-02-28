package com.qa.cinema.service;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.cinema.persistence.Ticket;
import com.qa.cinema.util.JSONUtil;

@Stateless
@Default
public class DBTicketService implements TicketService {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Inject
	private JSONUtil util;
	
	

	@Override
	public String createNewTicket(String ticketJson) {
		Ticket newTicket = util.getObjectForJSON(ticketJson, Ticket.class);
		em.persist(newTicket);
		return ticketJson;
	}

	@Override
	public String updateTicket(Long ticketID, String updatedTicket) {
		Ticket updateTicket = util.getObjectForJSON(updatedTicket, Ticket.class);
		Ticket ticket = findTicket(ticketID);
		if (ticket != null) {
			ticket = updateTicket;
			em.merge(ticket);
		}
		return "{\"message\": \"ticket sucessfully updated\"}";
	}

	@Override
	public String deleteTicket(Long ticketID) {
		Ticket ticket = findTicket(ticketID);
		if (ticket != null) {
			em.remove(ticket);
		}
		return "{\"message\": \"ticket sucessfully updated\"}";
	}

	private Ticket findTicket(Long id) {
		return em.find(Ticket.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public String showTicket() {
		//Query query = em.createQuery("SELECT t FROM Ticket t WHERE TICKETID = " + ticketID);
		Query query = em.createQuery("SELECT t FROM Ticket t");
		Collection<Ticket> ticket = (Collection<Ticket>) query.getResultList();
		return util.getJSONForObject(ticket);
	}

}
