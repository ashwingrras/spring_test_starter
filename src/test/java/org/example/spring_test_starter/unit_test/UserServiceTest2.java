package org.example.spring_test_starter.unit_test;

import org.example.spring_test_starter.entity.User;
import org.example.spring_test_starter.repository.UserRepository;
import org.example.spring_test_starter.service.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest2 {

    @Mock
    UserRepository repository;

    @InjectMocks
    UserService service;

    User user;

    @BeforeEach
    void setup2() {

        System.out.println("Creating User");

        user = new User();
        user.setName("Rohan");
    }

    @AfterEach
    void cleanup2() {

        System.out.println("Cleaning...");
        user = null;
    }

    @Test
    void shouldSaveUser2() {

        when(repository.save(any(User.class))).thenReturn(user);
        System.out.println("user before save "+user.getName());

        User saved = service.save(user);
        //System.out.println("save user "+saved.getName());
        assertEquals("Rohan", saved.getName());

        verify(repository).save(user);
    }

    @Test
    void shouldReturnName2() {

        assertEquals("Rohan", user.getName());
    }
}