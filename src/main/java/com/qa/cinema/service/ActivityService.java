package com.qa.cinema.service;

public interface ActivityService {
	String listAllActivities();
	String createActivity(String activityJSON);
	String updateActivity(Long activityID, String activityJSON);
	String deleteActivity(Long activityID);
}
