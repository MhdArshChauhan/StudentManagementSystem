package com.hpc.student_management_system.controller;

import com.hpc.student_management_system.dto.StudentRequestDto;
import com.hpc.student_management_system.entity.Student;
import com.hpc.student_management_system.service.StudentService;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	// GET ALL STUDENTS
	@GetMapping
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable Long id) {
		return studentService.getStudentById(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Student createStudent(@Valid @RequestBody StudentRequestDto dto) {
		return studentService.createStudent(dto);
	}

	@DeleteMapping("{id}")
	public void deleteStudentById(@PathVariable Long id) {
		studentService.deleteStudentById(id);
	}

	@PutMapping("{id}")
	public Student updateStudent(@PathVariable Long id, @Valid @RequestBody StudentRequestDto dto) {
		return studentService.updateStudent(id, dto);
	}
}
