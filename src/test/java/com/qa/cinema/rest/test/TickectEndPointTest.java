package com.qa.cinema.rest.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.rest.TicketEndPoint;
import com.qa.cinema.service.TicketService;

@RunWith(MockitoJUnitRunner.class)
public class TickectEndPointTest {

	@InjectMocks
	private TicketEndPoint subject;
	
	private static final String MOCKSTRING = "[{\"ticketID\" : 1, \"ticketType\" : \"adult\", \"bookingID\" : 1}]";
	private static final String MOCK_DELETE_MESSAGE = "{\"message\": \"ticket sucessfully removed\"}";
	
	@Mock
	private TicketService mockService;
	
	@Test
	public void testCreateNewTicket(){
		Mockito.when(mockService.createNewTicket(MOCKSTRING)).thenReturn(MOCKSTRING);
		String ticketString = subject.createNewTicket(MOCKSTRING);
		Mockito.verify(mockService).createNewTicket(MOCKSTRING);
		assertEquals(MOCKSTRING, ticketString);
	}

	@Test
	public void testDeleteTicket(){
		Mockito.when(mockService.deleteTicket(Mockito.anyLong())).thenReturn(MOCK_DELETE_MESSAGE);
		String deleteMessage = subject.deleteTicket(new Long(1));
		Mockito.verify(mockService).deleteTicket(new Long(1));
		assertEquals(MOCK_DELETE_MESSAGE, deleteMessage);
	}
	
	@Test
	public void testUpdateTicket(){
		Mockito.when(mockService.updateTicket(new Long(1), MOCKSTRING)).thenReturn(MOCKSTRING);
		String ticketString = subject.updateTicket(new Long(1), MOCKSTRING);
		Mockito.verify(mockService).updateTicket(new Long(1), MOCKSTRING);
		assertEquals(MOCKSTRING, ticketString);
	}
	
}
