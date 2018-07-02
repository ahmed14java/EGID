package com.nhs.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

@Entity
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "film_id", columnDefinition = "smallint(5)")
	private int filmId;

	private String title;

	@Column(columnDefinition = "TEXT")
	private String description;

	@Column(name = "release_year", columnDefinition = "year(4)")
	private int releaseYear = 2018;

	@Column(columnDefinition = "smallint(5)")
	private int length;

	@CreatedDate
	@Column(columnDefinition = "TIMESTAMP", name = "last_update")
	private Date lastUpdate;

	@Column(columnDefinition = "enum('G','PG','PG-13','R','NC-17')")
	private String rating = "G";

	@ManyToOne
	@JoinColumn(name = "language_id", columnDefinition = "tinyint(3)")
	private Language language1;

	@ManyToOne
	@JoinColumn(name = "original_language_id", columnDefinition = "tinyint(3)")
	private Language language2;

	@Column(name = "special_features", columnDefinition = "set('Trailers','Commentaries','Deleted Scenes','Behind the Scenes')")
	private String specialFeatures;

	@Column(name = "rental_rate", columnDefinition = "decimal(4,2)")
	private Double rentalRate = 4.99;

	@Column(name = "rental_duration", columnDefinition = "tinyint(3)")
	private int rentalDuration = 3;

	@Column(name = "replace_cost", columnDefinition = "decimal(5,2)")
	private Double replaceCost;

	public Film() {
	}

	public Film(String rating) {
		this.rating = rating;
	}

	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(Double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public int getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public Double getReplaceCost() {
		return replaceCost;
	}

	public void setReplaceCost(Double replaceCost) {
		this.replaceCost = replaceCost;
	}

	public Language getLanguage1() {
		return language1;
	}

	public void setLanguage1(Language language1) {
		this.language1 = language1;
	}

	public Language getLanguage2() {
		return language2;
	}

	public void setLanguage2(Language language2) {
		this.language2 = language2;
	}

	public String getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

}
