package com.myorganization.organizer.service;

import com.myorganization.organizer.entity.Task;
import com.myorganization.organizer.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAll(){
        return taskRepository.findAll(Sort.by(Sort.Order.asc("date"),
                                            Sort.Order.desc("priorityId")));
    }

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public void delete (int id) {
        taskRepository.deleteById(id);
    }
}
