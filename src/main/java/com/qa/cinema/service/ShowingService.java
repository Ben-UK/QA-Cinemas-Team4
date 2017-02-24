package com.qa.cinema.service;

public interface ShowingService {
	String listAllShowings();
	
	String createShowing(String showing);

	String updateShowing(Long showingID, String showing);

	String deleteShowing(Long showingID);
	

}
