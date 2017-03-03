package com.qa.cinema.persistence.test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.Test;
import com.qa.cinema.persistence.Event;

public class EventTest {

    @Test
    public void testSetGetEventID() {
	Event event = new Event();
	event.setEventID(new Long(1));
	Long assertion = event.getEventID();
	assertEquals(assertion, new Long(1));
    }

    @Test
    public void testSetGetCertification() {
	Event event = new Event();
	event.setCertification("12A");
	String certification = event.getCertification();
	assertEquals(certification, "12A");
    }

    @Test
    public void testSetGetDescription() {
	Event event = new Event();
	event.setDescription("Wizards");
	String description = event.getDescription();
	assertEquals(description, "Wizards");
    }

    @Test
    public void testSetGetReleaseDate() {
	Event event = new Event();
	Calendar newReleaseDate = new GregorianCalendar();
	newReleaseDate.set(2012, 7, 21);
	event.setReleaseDate(newReleaseDate);
	Calendar releaseDate = event.getReleaseDate();
	assertEquals(releaseDate, newReleaseDate);
    }

    @Test
    public void testSetEventTypeAndGetEventType() {
	Event event = new Event();
	event.setEventType("film");
	String assertion = event.getEventType();
	assertEquals(assertion, "film");
    }
    
    @Test
    public void testSetEventTitleGetEventTitle(){
	Event event = new Event();
	event.setTitle("Kes");
	String assertion = event.getTitle();
	assertEquals(assertion, "Kes");
    }
    
    @Test
    public void testSetGetShowingID() {
	Event event = new Event();
	event.setShowingID(new Long(1));
	Long assertion = event.getShowingID();
	assertEquals(assertion, new Long(1));
    }
}
