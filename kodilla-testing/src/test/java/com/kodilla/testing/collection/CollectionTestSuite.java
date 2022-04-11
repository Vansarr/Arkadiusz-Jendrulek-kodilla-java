package com.kodilla.testing.collection;

import com.example.kodillatesting.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Testing begins");
    }
    @AfterEach
    public void after() {
        System.out.println("Testing finished");
    }

    @DisplayName("Tests if the List remains empty after using OddNumbersExterminator()")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator odd = new OddNumbersExterminator();
        //When
        List<Integer> result = odd.exterminate(emptyList);
        //Then
        Assertions.assertEquals(emptyList, result);
    }

    @DisplayName("Tests if the list contains only even numbers after using OddNumbersExterminator()")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator odd = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        for (int i=0; i<6; i++) {
            numbers.add(i);
        }
        List<Integer> evenNumbers = new ArrayList<>(){
            {
                add(0, 0);
                add(1, 2);
                add(2, 4);
            }
        };
        //When
        List<Integer> exterminatedNumbers = odd.exterminate(numbers);
        //Then
        Assertions.assertEquals(exterminatedNumbers, evenNumbers);
    }

}
