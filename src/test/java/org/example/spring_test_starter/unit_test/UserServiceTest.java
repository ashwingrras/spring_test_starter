package org.example.spring_test_starter.unit_test;

import org.example.spring_test_starter.entity.User;
import org.example.spring_test_starter.repository.UserRepository;
import org.example.spring_test_starter.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserService service;

    @Test
    void shouldSaveUser() {

        User user = new User();
        user.setName("Ashwin");
        User saved = service.save(user);

        assertEquals("Ashwin", saved.getName());

    }
}

