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
        ShapeCollector collector = new ShapeCollector();
        Shape square = new Square(5);
        //When
        collector.addFigure(square);
        //Then
        Assertions.assertEquals(1, collector.getFiguresQuantity());
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape square = new Square(5);
        //When
        boolean result = collector.removeFigure(square);
        //Then
        Assertions.assertFalse(result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape square = new Square(5);
        collector.addFigure(square);
        //When
        boolean result = collector.removeFigure(square);
        //Then
        Assertions.assertTrue(result);
    }

    @Test
    public void testGetFigureNotExisting() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape square = new Square(5);
        //When
        Shape retrievedFigure = collector.getFigure(0);
        //Then
        Assertions.assertNotEquals(retrievedFigure, square);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape square = new Square(5);
        collector.addFigure(square);
        //When
        Shape retrievedFigure = collector.getFigure(0);
        //Then
        Assertions.assertEquals(square, retrievedFigure);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector collector = new ShapeCollector(){
            {
                addFigure(new Square(5));
                addFigure(new Triangle(5, 5));
            }
        };
        //When
        collector.showFigures();
        //Then

    }
}
