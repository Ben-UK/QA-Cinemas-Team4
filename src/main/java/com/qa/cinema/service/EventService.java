package com.qa.cinema.service;

public interface EventService {

	String listAllEvent();

	String createNewEvent(String event);

	String updateEvent(Long eventID, String event);

	String deleteEvent(Long eventID);

}
