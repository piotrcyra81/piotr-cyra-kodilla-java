package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private String name;
    private String surname;
    private int updateCount;

    public Mentor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(TasksQueue tasksQueue){
        System.out.println(name + ": New task from " + tasksQueue.getStudent().getName() +
                ". Total number of tasks to check: " + tasksQueue.getTasks().size());
        updateCount++;
    }
}
