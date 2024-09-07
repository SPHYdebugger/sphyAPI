package com.casa.sphyAPI.service;
import com.casa.sphyAPI.model.Task;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    public TaskService() {
        // Datos de ejemplo
        tasks.add(new Task(UUID.randomUUID().toString(), "Task 1", false));
        tasks.add(new Task(UUID.randomUUID().toString(), "Task 2", true));
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task getTaskById(String id) {
        return tasks.stream()
                .filter(task -> task.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }
}