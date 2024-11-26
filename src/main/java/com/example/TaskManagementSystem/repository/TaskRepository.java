package com.example.TaskManagementSystem.repository;

import com.example.TaskManagementSystem.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByAuthorEmail(String authorEmail);
    List<Task> findByAssigneeEmail(String assigneeEmail);
    Optional<Task> findById(Long id);
}
