package com.nhs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhs.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
