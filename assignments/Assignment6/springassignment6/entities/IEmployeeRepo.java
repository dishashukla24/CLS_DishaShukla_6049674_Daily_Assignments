package com.demo.springassignment6.entities;

public interface IEmployeeRepo {
	
	void addEmployee(Employee e);

	void viewEmployeebyID(int id);

	void viewAllEmployees();

	void updateEmployee(Employee e);

	void deleteEmployee(int id);

}