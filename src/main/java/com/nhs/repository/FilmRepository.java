package com.nhs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhs.domain.Film;

public interface FilmRepository extends JpaRepository<Film, Integer> {

}
