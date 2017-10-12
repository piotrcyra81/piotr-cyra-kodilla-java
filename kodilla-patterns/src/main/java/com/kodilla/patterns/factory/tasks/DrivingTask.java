package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task{

    final String taskName;
    final String where;
    final String using;
    boolean executedTask = false;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        return executedTask;
    }

    public void executeTask() {
        System.out.println("Driving done");
        executedTask = true;
    }
}