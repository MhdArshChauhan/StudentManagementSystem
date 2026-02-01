package com.hpc.student_management_system.service;

import com.hpc.student_management_system.dto.StudentRequestDto;
import com.hpc.student_management_system.entity.Student;

import java.util.List;

public interface StudentService {
	List<Student> getAllStudents();

	Student getStudentById(Long id);

	Student createStudent(StudentRequestDto dto);

	void deleteStudentById(Long id);

	Student updateStudent(Long id, StudentRequestDto dto);
}
