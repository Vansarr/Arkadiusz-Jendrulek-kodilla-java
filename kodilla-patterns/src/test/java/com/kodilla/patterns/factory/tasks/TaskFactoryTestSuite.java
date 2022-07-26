package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDriving(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        assertFalse(driving.isTaskExecuted());
        assertEquals("Doing: driving. driving imagination to over wild blue yonder",driving.executeTask());
        System.out.println(driving.executeTask());
        assertTrue(driving.isTaskExecuted());
    }
    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        //Then
        assertFalse(painting.isTaskExecuted());
        assertEquals("Doing painting. paint everything in colorful", painting.executeTask());
        System.out.println(painting.executeTask());
        assertTrue(painting.isTaskExecuted());
    }
    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertFalse(shopping.isTaskExecuted());
        assertEquals("Doing: shopping. buying 3.0 pizzas", shopping.executeTask());
        System.out.println(shopping.executeTask());
        assertTrue(shopping.isTaskExecuted());
    }
}