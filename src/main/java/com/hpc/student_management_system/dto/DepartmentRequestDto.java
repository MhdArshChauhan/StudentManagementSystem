package com.hpc.student_management_system.dto;

public class DepartmentRequestDto {
    private String departmentName;
    private String departmentCode;
    private String description;

    // Getters and Setters
    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }
    public String getDepartmentCode() { return departmentCode; }
    public void setDepartmentCode(String departmentCode) { this.departmentCode = departmentCode; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
