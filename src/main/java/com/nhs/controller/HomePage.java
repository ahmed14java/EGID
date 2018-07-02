package com.nhs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nhs.domain.Film;
import com.nhs.repository.FilmRepository;

@Controller
public class HomePage {

	@Autowired
	private FilmRepository filmRepository;

	@GetMapping("/")
	public ModelAndView getAllFilms(ModelAndView modelAndView, Film film, @RequestParam(defaultValue = "0") int page) {

		// List<Film> films = filmRepository.findAll();
		modelAndView.addObject("films", filmRepository.findAll(new PageRequest(page, 100)));
		modelAndView.addObject("currentPage", page);
		modelAndView.setViewName("index");
		return modelAndView;
	}

}
