package com.example.assignment8.dto;

public class DepartmentDTO {

    private String departmentName;
    private Long employeeCount;

    public DepartmentDTO(String departmentName, Long employeeCount) {
        this.departmentName = departmentName;
        this.employeeCount = employeeCount;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Long getEmployeeCount() {
        return employeeCount;
    }
}
