package com.nhs.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nhs.domain.Film;

public interface FilmDao extends PagingAndSortingRepository<Film, Long>{

}
