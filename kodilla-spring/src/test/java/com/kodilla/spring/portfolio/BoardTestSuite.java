package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Reader;
import com.kodilla.spring.reader.ReaderConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {


    @Test
    void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String task1 = "task to do";
        String task2 = "task in progress";
        String task3 = "task done";
        board.getToDoList().addTask(task1);
        board.getInProgressList().addTask(task2);
        board.getDoneList().addTask(task3);

        //Then
        assertEquals(task1, board.getToDoList().getTasks().get(0));
        assertEquals(task2, board.getInProgressList().getTasks().get(0));
        assertEquals(task3, board.getDoneList().getTasks().get(0));
    }
}
