package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Testing Task list";

    @Test
    void testTaskListDaoFindByListName() {
        // Given
        TaskList taskList = new TaskList("Test List", DESCRIPTION);
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> readTaskList = taskListDao.findByListName(name);

        //Then
        Assertions.assertEquals(1, readTaskList.size());

        //Cleanup
        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);
    }
}
