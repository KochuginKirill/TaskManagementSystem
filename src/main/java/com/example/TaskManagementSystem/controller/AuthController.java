package com.example.TaskManagementSystem.controller;

import com.example.TaskManagementSystem.model.User;
import com.example.TaskManagementSystem.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private UserService service;

    @PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody com.example.TaskManagementSystem.model.User getAuthUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth == null) {
            return null;
        }
        Object principal = auth.getPrincipal();
        User user = (principal instanceof User) ? (User) principal : null;
        return Objects.nonNull(user) ? service.getUserByEmail(user.getEmail()) : null;
    }

}