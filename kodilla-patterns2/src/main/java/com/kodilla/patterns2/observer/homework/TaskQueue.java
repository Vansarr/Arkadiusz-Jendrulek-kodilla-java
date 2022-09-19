package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements TaskObservable {
    private final List<TaskObserver> observers;
    private final List<String> tasks;
    private final String name;

    public List<TaskObserver> getObservers() {
        return observers;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }

    public TaskQueue(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyTaskObservers();
    }


    @Override
    public void registerTaskObserver(TaskObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyTaskObservers() {
        for (TaskObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeTaskObserver(TaskObserver observer) {
        observers.remove(observer);
    }
}
