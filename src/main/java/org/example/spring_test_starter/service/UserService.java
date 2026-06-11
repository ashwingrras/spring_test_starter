package org.example.spring_test_starter.service;

import lombok.RequiredArgsConstructor;
import org.example.spring_test_starter.entity.User;
import org.example.spring_test_starter.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public User save(User user){
        return repository.save(user);
    }

    public List<User> findAll(){
        return repository.findAll();
    }


}
