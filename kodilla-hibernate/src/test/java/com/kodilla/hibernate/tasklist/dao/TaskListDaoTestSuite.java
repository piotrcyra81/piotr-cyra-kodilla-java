package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.TaskList;
import com.kodilla.hibernate.task.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "New name";

    @Test
    public void testFindByListName() {
        TaskList taskList = new TaskList("Piotr", DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        List<TaskList> taskNames = taskListDao.findByListName(listName);
        Assert.assertEquals(2, taskNames.size());

        int id = taskNames.get(1).getId();
        taskListDao.delete(id);
    }
}