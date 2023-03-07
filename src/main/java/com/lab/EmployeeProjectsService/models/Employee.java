package com.lab.EmployeeProjectsService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;
    @Column(name="employee_number")
    private int employeeNumber;

    @OneToMany(mappedBy = "employee")
    @JsonIgnoreProperties({"employee"})
    private List<Assignment> assignment;
    @JsonIgnoreProperties({"employee"})
    @ManyToOne
    @JoinColumn(name="department_id", nullable=false)
    private Department department;

    public Employee(){};

    public Employee(String name, int employeeNumber, Department department) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.assignment = new ArrayList<>();
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public List<Assignment> getAssignment() {
        return assignment;
    }

    public void setAssignment(List<Assignment> assignment) {
        this.assignment = assignment;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
