package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task{

    final String taskName;
    final String color;
    final String whatToBuy;
    boolean executedTask = false;

    public PaintingTask(final String taskName, final String color, final String whatToBuy) {
        this.taskName = taskName;
        this.color = color;
        this.whatToBuy = whatToBuy;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        return executedTask;
    }

    public void executeTask() {
        System.out.println("Painting done");
        executedTask = true;
    }
}