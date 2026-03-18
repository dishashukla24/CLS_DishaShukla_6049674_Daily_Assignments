package com.demo.springassignment6.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
    private IEmployeeRepo repo;

    @Override
    public void addEmployee(Employee e) {
        repo.addEmployee(e);
    }
    @Override
	public
    void viewEmployeeByID(int id) {
    	repo.viewEmployeebyID(id);
    	
    }
    @Override
	public void viewAllEmployees() {
    	repo.viewAllEmployees();
		
	}
    
    @Override
	public void updateEmployee(Employee updateEmp) {
    	repo.updateEmployee(updateEmp);
		
	}
	@Override
	public void deleteEmployee(int deleteId) {
		repo.deleteEmployee(deleteId);
		
	}
	

}