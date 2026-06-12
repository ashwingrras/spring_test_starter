package org.example.spring_test_starter.controller;

import lombok.RequiredArgsConstructor;
import org.example.spring_test_starter.entity.User;
import org.example.spring_test_starter.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {


    private final UserService service;

    @GetMapping
    public List<User> getUsers(){
        System.out.println("inside getUsers");
        return service.findAll();
    }

    @PostMapping("/save")
    public User saveUsers(@RequestBody User user){
        System.out.println("inside saveUsers");
        System.out.println(user.getName());
        return service.save(user);
    }
}
