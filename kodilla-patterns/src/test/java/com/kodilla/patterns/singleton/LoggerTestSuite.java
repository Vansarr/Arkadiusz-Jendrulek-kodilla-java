package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void log() {
        logger = Logger.INSTANCE;
        logger.log("first log");
        logger.log("second log");
    }

    @Test
    public void testGetLastLog() {
        //WHEN
        String result = "second log";
        //THEN
        Assertions.assertEquals(result, logger.getLastLog());
    }
}
