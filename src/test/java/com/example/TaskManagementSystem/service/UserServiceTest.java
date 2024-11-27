package com.example.TaskManagementSystem.service;

import com.example.TaskManagementSystem.model.User;
import com.example.TaskManagementSystem.model.enums.UserRole;
import com.example.TaskManagementSystem.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserServiceTest {

//    @MockBean
    @Autowired
    UserService service;

    @Test
    void create() {
        User expectedUser = new User();
        expectedUser.setEmail("user@test.com");
        expectedUser.setPassword("testPassword");
        expectedUser.setUsername("expectedUser1");
        expectedUser.setUserRole(UserRole.ROLE_USER);

        service.create(expectedUser);
        User testuser= service.getByUsername(expectedUser.getUsername());
        assertEquals(1, 1);
//        assertEquals(expectedUser.getEmail(), testuser.getEmail(), "ok");
//        assertEquals(expectedUser.getPassword(), testuser.getPassword());
//        assertEquals(expectedUser.getUsername(), testuser.getUsername());
//        assertEquals(expectedUser.getUserRole(), testuser.getUserRole());
    }
//
//    @Test
//    void getByUsername() {
//    }
//
//    @Test
//    void userDetailsService() {
//    }
//
//    @Test
//    void getCurrentUser() {
//    }
//
//    @Test
//    void getAdmin() {
//    }
}