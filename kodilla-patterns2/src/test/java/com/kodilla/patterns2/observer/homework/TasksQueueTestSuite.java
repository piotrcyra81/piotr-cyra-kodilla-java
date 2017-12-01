package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class TasksQueueTestSuite {

    @Test
    public void testUpdate(){
        //Given
        Mentor michal = new Mentor("Michał", "Adamski");
        Mentor jan = new Mentor ("Jan", "Nowak");
        TasksQueue piotrTasksQueue = new TasksQueue(new Student("Piotr", "Cyra"));
        TasksQueue johnTasksQueue = new TasksQueue(new Student("John", "Smith"));
        TasksQueue ivoneTasksQueue = new TasksQueue(new Student("Ivone", "Escobar"));
        TasksQueue jessieTasksQueue = new TasksQueue(new Student("Jessie", "Pinkman"));
        piotrTasksQueue.registerObserver(michal);
        johnTasksQueue.registerObserver(michal);
        ivoneTasksQueue.registerObserver(jan);
        jessieTasksQueue.registerObserver(jan);
        //When
        piotrTasksQueue.addTask(new Task(1, "MySql project"));
        piotrTasksQueue.addTask(new Task(2, "Spring update"));
        johnTasksQueue.addTask(new Task(3, "Heroku configure"));
        ivoneTasksQueue.addTask(new Task(4, "Git tips"));
        jessieTasksQueue.addTask(new Task(5, "Hibernate"));
        //Then
        assertEquals(3, michal.getUpdateCount());
        assertEquals(2, jan.getUpdateCount());
    }
}
