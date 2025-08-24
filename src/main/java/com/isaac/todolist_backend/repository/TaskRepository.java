package com.isaac.todolist_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isaac.todolist_backend.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
