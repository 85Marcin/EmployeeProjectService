package com.lab.EmployeeProjectsService;

import com.lab.EmployeeProjectsService.models.Assignment;
import com.lab.EmployeeProjectsService.models.Department;
import com.lab.EmployeeProjectsService.models.Employee;
import com.lab.EmployeeProjectsService.models.Project;
import com.lab.EmployeeProjectsService.repositories.AssignmentRepository;
import com.lab.EmployeeProjectsService.repositories.DepartmentRepository;
import com.lab.EmployeeProjectsService.repositories.EmployeeRepository;
import com.lab.EmployeeProjectsService.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeProjectsServiceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	ProjectRepository projectRepository;
	@Autowired
	AssignmentRepository assignmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void create(){
		Department financeDepartment = new Department("Finance");
		departmentRepository.save(financeDepartment );

		Employee employee1 = new Employee("Dave",1234,financeDepartment );
		Employee employee2 = new Employee("John", 5678, financeDepartment);
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);

		Project project1 = new Project("Mortgages",5);
		projectRepository.save(project1);

		Assignment assignment1 = new Assignment(project1, employee1);
		assignmentRepository.save(assignment1);






	}



}
