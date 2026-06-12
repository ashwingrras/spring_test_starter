package org.example.spring_test_starter.service;

import org.example.spring_test_starter.dto.Student;
import org.example.spring_test_starter.repository.StudentRepository;

public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student save(Student student) {
        return repository.save(student);
    }
}
