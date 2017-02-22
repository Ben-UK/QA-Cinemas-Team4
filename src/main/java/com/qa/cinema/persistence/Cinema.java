package com.qa.cinema.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the cinema database table.
 * 
 */
@Entity
@NamedQuery(name="Cinema.findAll", query="SELECT c FROM Cinema c")
public class Cinema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long cinemaID;

	private String location;

	//bi-directional many-to-one association to Showing
	@OneToMany(mappedBy="cinema")
	private Set<Showing> showings;

	public Cinema() {
	}

	public Long getCinemaID() {
		return this.cinemaID;
	}

	public void setCinemaID(Long cinemaID) {
		this.cinemaID = cinemaID;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Showing> getShowings() {
		return this.showings;
	}

	public void setShowings(Set<Showing> showings) {
		this.showings = showings;
	}

	public Showing addShowing(Showing showing) {
		getShowings().add(showing);
		showing.setCinema(this);

		return showing;
	}

	public Showing removeShowing(Showing showing) {
		getShowings().remove(showing);
		showing.setCinema(null);

		return showing;
	}

}