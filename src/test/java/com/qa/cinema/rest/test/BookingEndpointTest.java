package com.qa.cinema.rest.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import com.qa.cinema.rest.BookingEndpoint;
import com.qa.cinema.service.BookingService;

@RunWith(MockitoJUnitRunner.class)
public class BookingEndpointTest {

    @InjectMocks
    private BookingEndpoint bookingEndpoint;

    private static final String MOCKSTRING = "[{ \"showing\": [{}], \"tickets\": [{}]]";

    private static final String MOCK_DELETE_MESSAGE = "{\"message\": \"film successfully removed\"}";
    @Mock
    private BookingService mockService;

    @Test
    public void testListAllBookings() {
	Mockito.when(mockService.listAllBookings()).thenReturn(MOCKSTRING);
	String bookingString = bookingEndpoint.listAllBookings();
	Mockito.verify(mockService).listAllBookings();
	assertEquals(MOCKSTRING, bookingString);

    }

    @Test
    public void testCreateBooking() {
	Mockito.when(mockService.createBooking(MOCKSTRING)).thenReturn(MOCKSTRING);
	String bookingString = bookingEndpoint.createBooking(MOCKSTRING);
	Mockito.verify(mockService).createBooking(MOCKSTRING);
	assertEquals(MOCKSTRING, bookingString);

    }

    @Test
    public void testUpdateBooking() {
	Mockito.when(mockService.updateBooking(new Long(1), MOCKSTRING)).thenReturn(MOCKSTRING);
	String bookingString = bookingEndpoint.updateBooking(new Long(1), MOCKSTRING);
	Mockito.verify(mockService).updateBooking(new Long(1), MOCKSTRING);
	assertEquals(MOCKSTRING, bookingString);

    }

    @Test
    public void testDeleteBooking() {
	Mockito.when(mockService.deleteBooking(new Long(1))).thenReturn(MOCK_DELETE_MESSAGE);
	String bookingString = bookingEndpoint.deleteBooking(new Long(1));
	Mockito.verify(mockService).deleteBooking(new Long(1));
	assertEquals(MOCK_DELETE_MESSAGE, bookingString);

    }

}
