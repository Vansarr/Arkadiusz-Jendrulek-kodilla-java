package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskQueueTest {

    @Test
    public void testQueues() {
        //Given
        TaskQueue arek = new TaskQueue("Arek's queue");
        TaskQueue george = new TaskQueue("George's queue");
        TaskQueue william = new TaskQueue("William's queue");
        Mentor greg = new Mentor("Gregory");
        Mentor peter = new Mentor("Peter");
        arek.registerTaskObserver(greg);
        george.registerTaskObserver(greg);
        george.registerTaskObserver(peter);
        william.registerTaskObserver(peter);
        //When
        arek.addTask("24.4 Observer");
        george.addTask("29.3 Controller testing");
        william.addTask("14.4 Spring Web");
        //Then
        assertEquals(2, greg.getUpdateCount());
        assertEquals(2, peter.getUpdateCount());
    }

}