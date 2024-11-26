package com.example.TaskManagementSystem.controller;

import com.example.TaskManagementSystem.model.Task;
import com.example.TaskManagementSystem.service.TaskService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TaskController {

    TaskService service;

    @GetMapping("/tasks/getAll")
    @ResponseBody
    public List<Task> getAllTasks(){
        return service.getAllTasks();
    }

    @GetMapping("/tasks/getByAuthor")
    @ResponseBody
    public List<Task> getTasksByAuthor(String userEmail){
        return service.getTasksByAuthorEmail(userEmail);
    }

    @GetMapping("/tasks/getByAssigneeEmail")
    @ResponseBody
    public List<Task> getTasksByAssigneeEmail(String userEmail){
        return service.getTasksByAssigneeEmail(userEmail);
    }

    @GetMapping("/tasks/add")
    @ResponseBody
    public void getTasksByAssigneeEmail(Task task){
        service.addTask(task);
    }

    @GetMapping("/tasks/deleteById")
    @ResponseBody
    public void removeTask(Long id) {
        service.removeTask(id);
    }

    @GetMapping("/tasks/update")
    @ResponseBody
    public void updateTask(Task task, Long id) {
        service.updateTask(task, id);
    }
}
