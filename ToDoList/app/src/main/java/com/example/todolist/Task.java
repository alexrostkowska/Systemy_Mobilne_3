package com.example.todoapp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;

    Category category;
    Calendar calendar;
    SimpleDateFormat simpleDateFormat;

    public Task(){
        //calendar = Calendar.getInstance();
        id = UUID.randomUUID();
        date = new Date();
        category = Category.dom;
        //simpleDateFormat = new SimpleDateFormat("dd MMM yyyy");
        //date = simpleDateFormat.format(calendar.getTime()).toString();
    }

    public void setName(String n) {
        this.name = n;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) { this.date = date; }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean d) {
        this.done = d;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getCategory(){ return category; }

    public void setCategory(Category category) { this.category = category; }
}
