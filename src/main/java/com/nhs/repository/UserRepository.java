package com.nhs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhs.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
