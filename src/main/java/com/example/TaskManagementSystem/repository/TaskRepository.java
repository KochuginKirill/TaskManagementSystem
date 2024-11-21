package com.example.TaskManagementSystem.repository;

import com.example.TaskManagementSystem.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByAuthorEmail(String authorEmail);
    List<Task> findByAssigneeEmail(String assigneeEmail);
    Optional<Task> findById(Long id);
}
