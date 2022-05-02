package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge challenge = new SecondChallenge();

        try {
            challenge.probablyIWillThrowException(2, 1);
        } catch (Exception e) {
            System.out.println("Exception thrown: " + e);;
        } finally {
            System.out.println("Done!");
        }

    }
}
