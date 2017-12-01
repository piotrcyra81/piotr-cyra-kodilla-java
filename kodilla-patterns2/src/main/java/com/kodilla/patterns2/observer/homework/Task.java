package com.kodilla.patterns2.observer.homework;

public class Task {

    private double taskNumber;
    private String name;

    public Task(double taskNumber, String name) {
        this.taskNumber = taskNumber;
        this.name = name;
    }

    public double getTaskNumber() {
        return taskNumber;
    }

    public String getName() {
        return name;
    }
}
