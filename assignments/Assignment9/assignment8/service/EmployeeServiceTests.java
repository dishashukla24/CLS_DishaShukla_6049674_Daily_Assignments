package com.example.assignment8.service;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.assignment8.entities.Department;
import com.example.assignment8.entities.Employee;
import com.example.assignment8.exception.DepartmentNameNotFoundException;

@SpringBootTest

class EmployeeServiceTests {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
    void testgetEmployeesByDept() {
    	List<Employee> actual = employeeService.getEmployeesByDept("CS");
    	List<Employee> expected = new ArrayList<>();
    	Employee e = new Employee();
    	Department d = new Department();
    	d.setId(1);
    	d.setManagerName("John");
    	d.setName("CS");
    	e.setDepartment(d);
    	e.setId(4);
    	Set<String> s = new HashSet<>();
    	s.add("9090909090");
    	s.add("8888888888");
    	e.setMobileNumbers(s);
    	e.setName("Shreya");
    	e.setSalary(2457.9);
    	expected.add(e);
    	assertEquals(expected.get(0).getId(),actual.get(0).getId());
    	assertEquals(expected.get(0).getName(),actual.get(0).getName());
    	assertEquals(expected.get(0).getSalary(),actual.get(0).getSalary());
	}
    	
		@Test
        void testgetEmployeesByDeptException() {
        	assertThrows(DepartmentNameNotFoundException.class,()->employeeService.getEmployeesByDept("CSE"));
        }
        @Test
        void testgetEmployeesByDeptNoException() {
        	assertDoesNotThrow(()->employeeService.getEmployeesByDept("CS"));
        }
    	
    }


