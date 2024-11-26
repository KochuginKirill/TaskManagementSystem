package com.example.TaskManagementSystem.controller;

import com.example.TaskManagementSystem.model.User;
import com.example.TaskManagementSystem.model.enums.UserRole;
import com.example.TaskManagementSystem.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;


    @PostMapping("/users/sava")
    @ResponseBody
    public String save(User user){
        userService.save(user);
        return  user.getUsername() + " сохранен";
    }

    @PostMapping("/users/create")
    @ResponseBody
    public String create(User user) {
        userService.create(user);
        return (user.getUsername() + " создан");
    }

    @GetMapping(("/users/getByName"))
    @ResponseBody
    public User getByUsername(String username) {
        return userService.getByUsername(username);
    }

    @GetMapping(("/users/getCurrentUser()"))
    @ResponseBody
    public User getCurrentUser() {
        return userService.getCurrentUser();
    }
}
