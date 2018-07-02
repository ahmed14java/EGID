package com.nhs.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nhs.domain.Film;
import com.nhs.domain.Language;
import com.nhs.domain.Rating;
import com.nhs.domain.SpecialFeature;
import com.nhs.repository.FilmRepository;
import com.nhs.repository.LanguageRepository;
import com.nhs.services.FilmService;

@Controller
public class FilmController {

	@Autowired
	private FilmService filmService;

	@Autowired
	private FilmRepository filmRepository;

	@Autowired
	private LanguageRepository languageRepository;

	@GetMapping("/allFilm")
	public ModelAndView getAllFilms(ModelAndView modelAndView, Film film, @RequestParam(defaultValue = "0") int page) {

		// List<Film> films = filmRepository.findAll();
		modelAndView.addObject("currentPage", page);
		modelAndView.addObject("films", filmRepository.findAll(new PageRequest(page, 100)));
		modelAndView.setViewName("films");
		return modelAndView;
	}

	@GetMapping("/createFilm")
	public ModelAndView createFilm(ModelAndView modelAndView) {
		Film film = new Film();
		modelAndView.getModel().put("film", film);

		List<Language> languages = languageRepository.findAll();
		modelAndView.getModel().put("languages", languages);

		List<Rating> ratings = Arrays.asList(Rating.values());
		modelAndView.getModel().put("ratings", ratings);

		List<SpecialFeature> features = Arrays.asList(SpecialFeature.values());
		modelAndView.getModel().put("features", features);

		modelAndView.setViewName("createFilm");
		return modelAndView;

	}

	@PostMapping("/createFilm")
	public ModelAndView saveFilm(ModelAndView modelAndView, Film film) {
		filmService.createFilm(film);
		modelAndView.setViewName("redirect:/allFilm");
		return modelAndView;
	}

	@GetMapping("/viewFilm/{id}")
	public ModelAndView getFilmById(ModelAndView modelAndView, @PathVariable("id") int id) {
		Film film = filmService.findFilmById(id);
		modelAndView.getModel().put("film", film);
		modelAndView.setViewName("viewFilm");
		return modelAndView;
	}

	@GetMapping("/updateFilm/{id}")
	public ModelAndView updateFilm(Film film, ModelAndView modelAndView, @PathVariable("id") int id) {
		modelAndView.getModel().put("film", filmService.findFilmById(id));
		List<Language> languages = languageRepository.findAll();
		modelAndView.getModel().put("languages", languages);
		List<Rating> ratings = Arrays.asList(Rating.values());
		modelAndView.getModel().put("ratings", ratings);

		List<SpecialFeature> features = Arrays.asList(SpecialFeature.values());
		modelAndView.getModel().put("features", features);

		modelAndView.setViewName("createFilm");

		return modelAndView;
	}
	
	@GetMapping("/deleteFilm/{id}")
	public ModelAndView deleteFilm(ModelAndView modelAndView, @PathVariable("id") int id) {
		filmRepository.delete(id);
//		modelAndView.addObject("currentPage", page);
//		modelAndView.addObject("films", filmRepository.findAll(new PageRequest(page, 100)));
		modelAndView.setViewName("redirect:/allFilm");
		return modelAndView;		
	}

}
