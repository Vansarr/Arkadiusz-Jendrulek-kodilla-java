package com.kodilla.testing.shape;

import com.example.kodillatesting.shape.*;
import org.junit.jupiter.api.*;

import java.util.*;

public class ShapeCollectorTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testAddFigure() {
        //Given
        List<Shape> theList = new ArrayList<>();
        Shape square = new Square(5)
        //When
        theList.addFigure(square);
        //Then
    }

    @Test
    public void testRemoveFigure() {
        //Given
        //When
        //Then
    }

    @Test
    public void testGetFigure() {
        //Given
        //When
        //Then
    }

    @Test
    public void testShowFigures() {
        //Given
        //When
        //Then
    }
}
