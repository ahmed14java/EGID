package com.nhs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhs.domain.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
