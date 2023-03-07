package com.lab.EmployeeProjectsService.repositories;

import com.lab.EmployeeProjectsService.models.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}
