package com.example.assignment8.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.assignment8.dto.DepartmentDTO;
import com.example.assignment8.entities.Department;

public interface IDepartmentRepo extends JpaRepository<Department, Integer> {

	@Query("SELECT new cg.example.Assignment8.dto.DeptCountDTO(d.name, COUNT(e)) " +
		       "FROM Department d LEFT JOIN d.employees e GROUP BY d.name")
		List<DepartmentDTO> countEmployeesByDepartment();

}