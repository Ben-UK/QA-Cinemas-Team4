package com.qa.cinema.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Calendar;

@Entity
@NamedQuery(name = "Event.findAll", query = "SELECT e FROM Event e")
public class Event implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long eventID;

	private String eventType;

	private String title;
	@Lob
	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar releaseDate;

	private String certification;

	@Column(name = "event_showingID")
	private Long showingID;

	public Event() {
	}

	public Long getEventID() {
		return this.eventID;
	}

	public void setEventID(Long eventID) {
		this.eventID = eventID;
	}

	public String getCertification() {
		return this.certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Calendar getReleaseDate() {
		return this.releaseDate;
	}

	public void setReleaseDate(Calendar releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public Long getShowingID() {
		return showingID;
	}

	public void setShowingID(Long showingID) {
		this.showingID = showingID;
	}

}