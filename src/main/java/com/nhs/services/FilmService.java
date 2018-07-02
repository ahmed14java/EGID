package com.nhs.services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nhs.domain.Film;

public interface FilmService {

	Film createFilm(Film film);
	
	List<Film> getAllFilms();
	
	Page<Film> getPage(int pageNumber);

	Film findFilmById(int id);
	
}
