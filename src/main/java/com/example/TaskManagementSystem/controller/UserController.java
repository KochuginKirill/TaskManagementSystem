package com.example.TaskManagementSystem.controller;

import com.example.TaskManagementSystem.model.User;
import com.example.TaskManagementSystem.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;


    @PostMapping("/users/sava")
    @ResponseBody
    public String save(User user){
        userService.save(user);
        String result = user.getUsername() + " сохранен";
        log.info(result);
        return result;
    }

    @PostMapping("/users/create")
    public String create(User user) {
        userService.create(user);
        String result = user.getUsername() + " создан";
        log.info(result);
        return (result);
    }
}
