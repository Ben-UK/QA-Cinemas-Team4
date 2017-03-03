package com.qa.cinema.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NamedQuery(name = "Cinema.findAll", query = "SELECT c FROM Cinema c")
public class Cinema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cinemaID;

	private String location;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "showing_cinemaID")
	private Set<Showing> showings = new HashSet<Showing>();

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
		return showings;
	}

	public void setShowings(Set<Showing> showings) {
		this.showings = showings;
	}

}