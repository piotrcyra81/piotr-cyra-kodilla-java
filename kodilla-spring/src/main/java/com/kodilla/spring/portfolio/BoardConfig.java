package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import java.util.ArrayList;
import java.util.List;

public class BoardConfig {

    @Bean
    @Scope("prototype")
    public TaskList taskToDoList () {
        List<String> tasks = new ArrayList<>();
        tasks.add("firstTaskToDo");
        return new TaskList(tasks);
    }

    @Bean
    @Scope("prototype")
    public TaskList taskInProgressList () {
        List<String> tasks = new ArrayList<>();
        tasks.add("firstTaskInProgress");
        return new TaskList(tasks);
    }

    @Bean
    @Scope("prototype")
    public TaskList taskDoneList () {
        List<String> tasks = new ArrayList<>();
        tasks.add("firstDone");
        return new TaskList(tasks);
    }

    @Bean
    public Board tasksBoard() {
        return new Board(taskToDoList(), taskInProgressList(), taskDoneList());
    }
}