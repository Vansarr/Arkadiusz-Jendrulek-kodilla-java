package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    public void testProbablyIWillThrowException() {
        // given
        SecondChallenge challenge = new SecondChallenge();
        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(2, 1)),
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(0, 1)),
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(1, 1.5)),
                () -> assertDoesNotThrow(() -> challenge.probablyIWillThrowException(1, 1))
        );
    }
}
