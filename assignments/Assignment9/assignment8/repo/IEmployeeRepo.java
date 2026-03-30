package com.example.assignment8.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.assignment8.entities.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

	 @Query("SELECT e FROM Employee e JOIN FETCH e.department")
	    List<Employee> findAllWithDepartment();
	    
	    @Query("SELECT e FROM Employee e WHERE e.department.name = :deptName")
	    List<Employee> findByDepartmentName(@Param("deptName") String deptName);

	    @Query("SELECT e FROM Employee e JOIN e.mobileNumbers m WHERE m = :mobile")
	    List<Employee> findByMobileNumber(@Param("mobile") String mobile);
}