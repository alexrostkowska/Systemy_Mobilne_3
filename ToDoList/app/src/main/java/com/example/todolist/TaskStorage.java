package com.example.todoapp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {

    private static TaskStorage instance = null;
    private final List<Task> tasks;

    public List<Task> getTasks(){
        return tasks;
    }

    public static TaskStorage getInstance(){
        if(instance == null){
            instance = new TaskStorage();
        }
        return instance;
    }

    private TaskStorage() {
        tasks = new ArrayList<>();
        for(int i=1; i<=150; i++){
            Task task = new Task();
            task.setName("Pilne zadanie numer " + i);
            task.setDone(i%3 == 0);
            if(i%3 == 0) {task.setCategory(Category.studia);}
            else { task.setCategory(Category.dom);}
            tasks.add(task);
        }
    }

    public Task getTask(UUID index) {
        for(Task t: tasks) {
            if(t.getId().equals(index)) {
                return t;
            }
        }
        return null;
    }
}
