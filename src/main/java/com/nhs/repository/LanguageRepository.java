package com.nhs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhs.domain.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer> {

}
