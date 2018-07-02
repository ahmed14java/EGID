package com.nhs.domain;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Language {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "language_id", columnDefinition = "tinyint(3)")
	private int languageId;

	@Column(name = "last_update")
	private Timestamp lastUpdate;

	@Column(columnDefinition = "char(20)")
	private String name;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "language1")
	@JsonIgnore
	private List<Film> films1;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "language2")
	@JsonIgnore
	private List<Film> films2;

	public Language() {
	}

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public List<Film> getFilms1() {
		return films1;
	}

	public void setFilms1(List<Film> films1) {
		this.films1 = films1;
	}

	public List<Film> getFilms2() {
		return films2;
	}

	public void setFilms2(List<Film> films2) {
		this.films2 = films2;
	}

	public Timestamp getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
