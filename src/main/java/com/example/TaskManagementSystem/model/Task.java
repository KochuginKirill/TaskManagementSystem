package com.example.TaskManagementSystem.model;

import com.example.TaskManagementSystem.model.enums.TaskPriority;
import com.example.TaskManagementSystem.model.enums.TaskStatus;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tasks")
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String headLine;

    @Column
    private String description;

    @Column
    private TaskStatus status;

    @Column
    private TaskPriority priority;

    @Column
    private String authorEmail;

    @Column
    private String assigneeEmail;
}
