package com.qa.cinema.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Calendar;

/**
 * The persistent class for the activity database table.
 * 
 */
@Entity
@NamedQuery(name="Activity.findAll", query="SELECT a FROM Activity a")
public class Activity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long activityID;

	private String certification;

	@Lob
	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar releaseDate;

	private String title;

	public Activity() {
	}
	
	public Activity(String title, String description,
			Calendar releaseDate, String certification) {
		super();
		this.certification = certification;
		this.description = description;
		this.releaseDate = releaseDate;
		this.title = title;
	}

	public Activity(String title, String description,
			Calendar releaseDate, String certification) {
		super();
		this.certification = certification;
		this.description = description;
		this.releaseDate = releaseDate;
		this.title = title;
	}

	public Long getActivityID() {
		return this.activityID;
	}

	public void setActivityID(Long activityID) {
		this.activityID = activityID;
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
}