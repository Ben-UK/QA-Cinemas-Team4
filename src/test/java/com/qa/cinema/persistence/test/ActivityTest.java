package com.qa.cinema.persistence.test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

import com.qa.cinema.persistence.Activity;

public class ActivityTest {


	@Test
	public void testgetTitle() {
		
		Calendar calendar = new GregorianCalendar(1990, 12, 12);		
		Activity activity = new Activity("testTitle", "testDescription", calendar, "18");
		String result = activity.getTitle();
		Assert.assertEquals("testTitle", result);
	}
	
	@Test
	public void testsetTitle() {
		Calendar calendar = new GregorianCalendar(1990, 12, 12);
		Activity activity = new Activity("testTitle", "testDescription", calendar, "18");
		activity.setTitle("newTitle");
		String result = activity.getTitle();
		Assert.assertEquals("newTitle", result);
	}
	
	@Test
	public void testgetDescription() {
		Calendar calendar = new GregorianCalendar(1990, 12, 12);
		Activity activity = new Activity("testTitle", "testDescription", calendar, "18");
		String result = activity.getDescription();
		Assert.assertEquals("testDescription", result);
	}
	
	@Test
	public void testsetDescription() {
		Calendar calendar = new GregorianCalendar(1990, 12, 12);
		Activity activity = new Activity("testTitle", "testDescription", calendar, "18");
		activity.setDescription("newDescription");
		String result = activity.getDescription();
		Assert.assertEquals("newDescription", result);
	}
	
	@Test
	public void testgetCetification() {
		Calendar calendar = new GregorianCalendar(1990, 12, 12);
		Activity activity = new Activity("testTitle", "testDescription", calendar, "18");
		String result = activity.getCertification();
		Assert.assertEquals("18", result);	
	}
	
	@Test
	public void testsetCertification() {
		Calendar calendar = new GregorianCalendar(1990, 12, 12);
		Activity activity = new Activity("testTitle", "testDescription", calendar, "18");
		activity.setCertification("21");
		String result = activity.getCertification();
		Assert.assertEquals("21", result);	
	}
		
	@Test
	public void testgetReleaseDate() {
		Calendar calendar = new GregorianCalendar(1990, 12, 12);		
		Activity activity = new Activity("testTitle", "testDescription", calendar, "18");
		Calendar result = activity.getReleaseDate();
		Assert.assertEquals(calendar, result);			
	}
	
	@Test
	public void testsetReleaseDate() {
		Calendar calendar = new GregorianCalendar(1990, 12, 12);
		Calendar newCalendar = new GregorianCalendar(1999, 12, 12);	
		Activity activity = new Activity("testTitle", "testDescription", calendar, "18");
		activity.setReleaseDate(newCalendar);
		Calendar result = activity.getReleaseDate();
		Assert.assertEquals(newCalendar, result);				
	}
}
