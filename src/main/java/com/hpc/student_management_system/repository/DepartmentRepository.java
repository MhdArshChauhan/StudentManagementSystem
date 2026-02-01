package com.hpc.student_management_system.repository;

import com.hpc.student_management_system.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    boolean existsByDepartmentName(String departmentName);
    boolean existsByDepartmentCode(String departmentCode);
}
