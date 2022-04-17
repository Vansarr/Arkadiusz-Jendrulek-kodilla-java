package com.kodilla.testing.shape;

import com.example.kodillatesting.shape.*;
import org.junit.jupiter.api.*;

import java.util.*;

@DisplayName("TDD: ShapeCollector Test Suite")
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

    @Nested
    @DisplayName("Tests adding and removing figures from the list")
    class TestAddingRemoving {

        @DisplayName("Tests if addFigure adds new shape to the list")
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

        @DisplayName("Tests if list remains empty after using removeFigure")
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

        @DisplayName("Tests if removeFigure removes shape from the list")
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
    }

    @Nested
    @DisplayName("Tests retrieving Figures from the list")
    class TestRetrieve {

        @DisplayName("Tests if getFigure can retrieve shape that is not on the list")
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

        @DisplayName("Tests if getFigure can retrieve shape that is on the list")
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

        @DisplayName("Tests if showFigure returns all contained shapes")
        @Test
        public void testShowFigures() {
            //Given
            ShapeCollector collector = new ShapeCollector() {
                {
                    addFigure(new Square(5));
                    addFigure(new Triangle(5, 5));
                }
            };
            //When
            String shownFigures = collector.showFigures();
            //Then
            Assertions.assertEquals(shownFigures, collector.toString());
        }
    }
}
