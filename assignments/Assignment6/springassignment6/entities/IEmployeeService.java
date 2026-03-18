package com.demo.springassignment6.entities;

public interface IEmployeeService {

	void addEmployee(Employee e);

	void viewEmployeeByID(int id);

	void viewAllEmployees();
	
	void updateEmployee(Employee updateEmp);
	
	void deleteEmployee(int id);

	
}
