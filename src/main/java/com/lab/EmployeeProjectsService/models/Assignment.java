package com.lab.EmployeeProjectsService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="assignments")
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @JsonIgnoreProperties({"assignment project employee"})
    @ManyToOne
    @JoinColumn(name="employee_id", nullable = false )
    private Employee employee;
    @JsonIgnoreProperties({"assignment, employee"})
    @ManyToOne
    @JoinColumn(name="project_id", nullable = false)
    private Project project;

    public Assignment() {
    }

    public Assignment(Project project, Employee employee) {
        this.employee = employee;
        this.project = project;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployees() {
        return employee;
    }

    public void setEmployees(Employee employee) {
        this.employee = employee;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
