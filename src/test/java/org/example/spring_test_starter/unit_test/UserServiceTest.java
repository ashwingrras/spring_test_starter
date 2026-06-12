package org.example.spring_test_starter.unit_test;

import org.example.spring_test_starter.entity.User;
import org.example.spring_test_starter.repository.UserRepository;
import org.example.spring_test_starter.service.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository repository;

    @Mock
    private UserService service;

    @BeforeEach
    void testBeforeEach()
    {
        System.out.println("inside testBeforeEach");
    }

    @AfterEach
    void testAfterEach()
    {
        System.out.println("inside testAfterEach");
    }

    @Test
    void shouldSaveUser() {
        System.out.println("inside shouldSaveUser");
        User user = new User();
        user.setName("Ashwin");

        when(repository.save(any(User.class)))
                .thenReturn(user);

        User saved = service.save(user);

        assertEquals("Ashwin", saved.getName());

        verify(repository, times(1))
                .save(user);
    }


    @Test
    void shouldUserFound() {
        System.out.println("inside shouldUserFound");

        User user = new User(1, "hemant");

        when(repository.findByName("hemant"))
                .thenReturn(user);

        boolean result = service.checkUserByName("hemant");

        assertTrue(result);

        verify(repository).findByName("hemant");
    }

}

