package com.example.TaskManagementSystem.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.example.TaskManagementSystem.model.Task;
import org.springframework.stereotype.Service;
import com.example.TaskManagementSystem.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public List<Task> getTasksByAuthorEmail(String userEmail) {
        return taskRepository.findByAuthorEmail(userEmail);
    }

    public List<Task> getTasksByAssigneeEmail(String userEmail) {
        return taskRepository.findByAssigneeEmail(userEmail);
    }

    public void addTask(Task task) {
        taskRepository.save(task);
        log.info("Task added: {}", task.getHeadLine());
    }

    public void removeTask(Long id) {
        taskRepository.deleteById(id);
        log.info("Task removed: {}", id);
    }

    public void updateTask(Task task, Long id) {
        Optional<Task> oldTask = taskRepository.findById(id);
        taskRepository.delete(oldTask.get());
        taskRepository.save(task);
        log.info("Task updated: {}", task.getHeadLine());
    }
}
