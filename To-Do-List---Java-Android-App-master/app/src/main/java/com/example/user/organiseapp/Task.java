package com.example.user.organiseapp;

import java.io.Serializable;


public class Task implements Serializable {

    private String title;
    private String description;
    private boolean complete;
    private String due_date;

    public Task(String title, String description, String due_date, boolean complete){

        this.title = title;
        this.description = description;
        this.complete = complete;
        this.due_date = due_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getDueDate() {
        return due_date;
    }

    public void setDueDate(String due_date) {
        this.due_date = due_date;
    }

}
