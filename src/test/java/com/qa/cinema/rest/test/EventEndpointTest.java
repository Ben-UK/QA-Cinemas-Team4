package com.qa.cinema.rest.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.rest.EventEndpoint;
import com.qa.cinema.service.EventService;

@RunWith(MockitoJUnitRunner.class)
public class EventEndpointTest {

    @InjectMocks
    private EventEndpoint eventEndpoint;

    private static final String MOCKSTRING = "[{\"eventID\": 1,\"certification\": \"12A\",\"description\": \"Test\",\"releaseDate\": \" {\"year\":2017,\"month\":1,\"dayOfMonth\":24} \",\"title\": \"test1\"}]";

    private static final String MOCK_DELETE_MESSAGE = "{\"message\": \" event sucessfully removed\"}";

    @Mock
    private EventService mockService;

    @Test
    public void testListAllFilms() {
	Mockito.when(mockService.listAllEvent()).thenReturn(MOCKSTRING);
	String filmString = eventEndpoint.listAllEvent();
	Mockito.verify(mockService).listAllEvent();
	assertEquals(MOCKSTRING, filmString);
    }

    @Test
    public void testCreateNewEvent() {
	Mockito.when(mockService.createNewEvent(MOCKSTRING)).thenReturn(MOCKSTRING);
	String eventString = eventEndpoint.createNewEvent(MOCKSTRING);
	Mockito.verify(mockService).createNewEvent(MOCKSTRING);
	assertEquals(MOCKSTRING, eventString);
    }

    @Test
    public void testUpdateEvent() {
	Mockito.when(mockService.updateEvent(new Long(1), MOCKSTRING)).thenReturn(MOCKSTRING);
	String eventString = eventEndpoint.updateEvent(new Long(1), MOCKSTRING);
	Mockito.verify(mockService).updateEvent(new Long(1), MOCKSTRING);
	assertEquals(MOCKSTRING, eventString);
    }

    @Test
    public void testDeleteEvent() {
	Mockito.when(mockService.deleteEvent(new Long(1))).thenReturn(MOCK_DELETE_MESSAGE);
	String eventString = eventEndpoint.deleteEvent(new Long(1));
	Mockito.verify(mockService).deleteEvent(new Long(1));
	assertEquals(MOCK_DELETE_MESSAGE, eventString);
    }

}
