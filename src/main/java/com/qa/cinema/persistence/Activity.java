package com.qa.cinema.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Calendar;
import java.util.Set;


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

	//bi-directional many-to-one association to Showing
	@OneToMany(mappedBy="activity")
	private Set<Showing> showings;

	public Activity() {
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

	public Set<Showing> getShowings() {
		return this.showings;
	}

	public void setShowings(Set<Showing> showings) {
		this.showings = showings;
	}

	public Showing addShowing(Showing showing) {
		getShowings().add(showing);
		showing.setActivity(this);

		return showing;
	}

	public Showing removeShowing(Showing showing) {
		getShowings().remove(showing);
		showing.setActivity(null);

		return showing;
	}

}