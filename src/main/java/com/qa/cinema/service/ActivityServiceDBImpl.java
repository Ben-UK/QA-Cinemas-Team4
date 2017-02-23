package com.qa.cinema.service;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.cinema.persistence.Activity;
import com.qa.cinema.util.JSONUtil;

@Stateless
@Default
public class ActivityServiceDBImpl implements ActivityService{
	
	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	@Inject
	private JSONUtil util;
	
	@Override
	public String listAllActivities() {
		Query query = em.createQuery("SELECT a FROM Activity a");
		Collection<Activity> activities = (Collection<Activity>) query.getResultList();		
		return util.getJSONForObject(activities);
	}

	@Override
	public String createActivity(String activityJSON) {
		Activity newActivity = util.getObjectForJSON(activityJSON, Activity.class);
		em.persist(newActivity);
		return activityJSON;
	}

	@Override
	public String updateActivity(Long activityID, String activityJSON) {
		Activity newActivity = util.getObjectForJSON(activityJSON, Activity.class);
		Activity activity = findActivity(new Long(activityID));
		if(activity != null){
			activity = newActivity;
			em.merge(activity);
		}
		return "{\"message\": \"activity sucessfully updated\"}";
	}

	@Override
	public String deleteActivity(Long activityID) {
		Activity activity = findActivity(new Long(activityID));
		if(activity != null){
			em.remove(activity);
		}	
		return "{\"message\": \"activity sucessfully removed\"}";
	}
	
	private Activity findActivity(Long activityID){
		return em.find(Activity.class, activityID);
	}
}
