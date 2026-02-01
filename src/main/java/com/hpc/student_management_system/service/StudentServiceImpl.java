package com.hpc.student_management_system.service;

import com.hpc.student_management_system.dto.StudentRequestDto;
import com.hpc.student_management_system.entity.Student;
import com.hpc.student_management_system.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		Optional<Student> optionalStudent = studentRepository.findById(id);
		if (optionalStudent.isPresent()) {
			return optionalStudent.get();
		} else {
			return null;
		}
	}

	@Override
	public Student createStudent(StudentRequestDto dto) {

		if (studentRepository.existsByEmail(dto.getEmail())) {
			throw new RuntimeException("Email already exists");
		}

		Student student = new Student();
		student.setFirstName(dto.getFirstName());
		student.setLastName(dto.getLastName());
		student.setEmail(dto.getEmail());
		student.setPhone(dto.getPhone());
		student.setDateOfBirth(dto.getDateOfBirth());
		student.setEnrollmentDate(dto.getEnrollmentDate());
		student.setGender(dto.getGender());
		student.setStatus(dto.getStatus());
		student.setAddress(dto.getAddress());
		student.setCreatedAt(LocalDateTime.now());
		student.setUpdatedAt(LocalDateTime.now());

		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		Optional<Student> optionalStudent = studentRepository.findById(id);
		if (optionalStudent.isPresent()) {
			studentRepository.deleteById(id);
		}
	}

	@Override
	public Student updateStudent(Long id, StudentRequestDto dto) {
		Optional<Student> optionalStudent = studentRepository.findById(id);
		if (!optionalStudent.isPresent()) {
			throw new RuntimeException("id doesn't exist " + id);
		}

		Student student = new Student();
		student.setFirstName(dto.getFirstName());
		student.setLastName(dto.getLastName());
		student.setEmail(dto.getEmail());
		student.setPhone(dto.getPhone());
		student.setDateOfBirth(dto.getDateOfBirth());
		student.setEnrollmentDate(dto.getEnrollmentDate());
		student.setGender(dto.getGender());
		student.setStatus(dto.getStatus());
		student.setAddress(dto.getAddress());
		student.setCreatedAt(LocalDateTime.now());
		student.setUpdatedAt(LocalDateTime.now());

		return studentRepository.save(student);
		
	}
}
