package com.myorganization.organizer.repository;

import com.myorganization.organizer.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
