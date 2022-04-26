package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] array={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //When
        double average = ArrayOperations.getAverage(array);
        //Then
        double expected = 10.5;
        Assertions.assertEquals(expected, average);
    }
}
