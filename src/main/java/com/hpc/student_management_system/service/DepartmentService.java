package com.hpc.student_management_system.service;

import com.hpc.student_management_system.dto.DepartmentRequestDto;
import com.hpc.student_management_system.entity.Department;
import java.util.List;

public interface DepartmentService {
    Department createDepartment(DepartmentRequestDto departmentRequestDto);
    List<Department> getAllDepartments();
    Department getDepartmentById(Long id);
    Department updateDepartment(Long id, DepartmentRequestDto departmentRequestDto);
    void deleteDepartment(Long id);
}
