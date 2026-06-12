package org.example.spring_test_starter.unit_test;

import org.example.spring_test_starter.dto.Student;
import org.example.spring_test_starter.repository.StudentRepository;
import org.example.spring_test_starter.service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {

    @Mock
    StudentRepository repository;

    @InjectMocks
    StudentService service;

    @Test
    void shouldSaveStudent() {

        Student student = new Student(1, "Ashwin");

        when(repository.save(any(Student.class)))
                .thenReturn(student);

        Student saved = service.save(student);

        assertEquals("Ashwin", saved.getName());

        verify(repository).save(student);
    }
}
