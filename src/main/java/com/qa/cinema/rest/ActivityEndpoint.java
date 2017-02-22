package com.qa.cinema.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/activity")
public class ActivityEndpoint {
	@Inject
	private ActivityService activityService;
	
	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String listAllActivitiesAsJSON(){
		return activityService.listAllActivities();
	}
		
	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String createActivityAsJSON(String activityJSON){
		return activityService.createActivity(activityJSON);
	}
	
	@PUT
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String updateActivityAsJSON(@PathParam("activityID") Long activityID, String activityJSON){
		return activityService.updateActivity(activityID, activityJSON);
	}
	
	@DELETE
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String deleteActivityAsJSON(@PathParam("activityID") Long activityID){
		return activityService.deleteActivity(activityID);	
	}
}
