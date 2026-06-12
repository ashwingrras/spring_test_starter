package org.example.spring_test_starter.repository;

import org.example.spring_test_starter.dto.Student;

public interface StudentRepository {

    Student save(Student student);
}