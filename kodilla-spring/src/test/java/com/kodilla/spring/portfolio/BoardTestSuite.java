package com.kodilla.kodilla.spring.portfolio;

import com.kodilla.spring.portfolio.Board;
import com.kodilla.spring.portfolio.BoardConfig;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;
import java.util.stream.Collectors;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        String ToDoList = board.getToDoList().getTasks().stream()
                .collect(Collectors.joining());
        String InProgressList = board.getInProgressList().getTasks().stream()
                .collect(Collectors.joining());
        String DoneList = board.getDoneList().getTasks().stream()
                .collect(Collectors.joining());

        Assert.assertEquals("firstTaskToDo", ToDoList);
        Assert.assertEquals("firstTaskInProgress", InProgressList);
        Assert.assertEquals("firstDone", DoneList);
    }
}