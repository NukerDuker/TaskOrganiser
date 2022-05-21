package com.myorganization.organizer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;


@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer priorityId;

    private String description;

    private Date date;

    public Task() {
    }

    public Task(Integer id, Integer priorityId, String description, Date date) {
        this.id = id;
        this.priorityId = priorityId;
        this.description = description;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPriorityId() {
        return priorityId;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
