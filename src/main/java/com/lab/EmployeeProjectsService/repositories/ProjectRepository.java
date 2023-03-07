package com.lab.EmployeeProjectsService.repositories;

import com.lab.EmployeeProjectsService.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
