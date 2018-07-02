package com.nhs.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nhs.domain.Film;
import com.nhs.repository.FilmDao;
import com.nhs.repository.FilmRepository;
import com.nhs.services.FilmService;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmRepository filmRepository;

	@Autowired
	private FilmDao filmDao;

	@Override
	public Film createFilm(Film film) {
		film.setLastUpdate(new Date());
		return filmRepository.save(film);
	}

	@Override
	public List<Film> getAllFilms() {
		List<Film> films = filmRepository.findAll();
		return films;
	}

	@Override
	public Page<Film> getPage(int pageNumber) {
		PageRequest request = new PageRequest(pageNumber - 1, 10);
		return filmDao.findAll(request);
	}

	@Override
	public Film findFilmById(int id) {
		Film film = filmRepository.findOne(id);
		return film;
	}

}
