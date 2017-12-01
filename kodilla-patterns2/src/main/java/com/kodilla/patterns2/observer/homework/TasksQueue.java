package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TasksQueue implements Observable{

    private final List<Observer> observers;
    private final Deque<Task> tasks;
    private final Student student;

    public TasksQueue(Student student) {
        observers = new ArrayList<>();
        tasks = new ArrayDeque<Task>();
        this.student = student;
    }

    public Deque<Task> getTasks() {
        return tasks;
    }

    public Student getStudent() {
        return student;
    }

    public void addTask(Task task){
        tasks.offer(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
