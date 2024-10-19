package com.miracleInterview.taskmanagement.service;


import com.miracleInterview.taskmanagement.model.Task;
import com.miracleInterview.taskmanagement.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks(String status) {
        if (status != null) {
            return taskRepository.findByStatus(status);
        }
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    public Task updateTask(Long id, Task updatedTask) {
        return taskRepository.findById(id).map(task -> {
            if (updatedTask.getTitle() != null) task.setTitle(updatedTask.getTitle());
            if (updatedTask.getDescription() != null) task.setDescription(updatedTask.getDescription());
            if (updatedTask.getDueDate() != null) task.setDueDate(updatedTask.getDueDate());
            return taskRepository.save(task);
        }).orElse(null);
    }

    public boolean deleteTask(Long id) {
        return taskRepository.findById(id).map(task -> {
            taskRepository.delete(task);
            return true;
        }).orElse(false);
    }

    public Task markTaskAsCompleted(Long id) {
        return taskRepository.findById(id).map(task -> {
            task.setStatus("Completed");
            return taskRepository.save(task);
        }).orElse(null);
    }
}
