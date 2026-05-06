package com.sample.questions;

class CustomExceptionDemo {

    public static void checkAge(int age) throws InvalidAgeCustomException {
        if (age < 18) {
            throw new InvalidAgeCustomException("Access denied. Age should be at least 18");
        } else System.out.println("Access Granted");
    }

    public static void main(String[] args) {
        try {
            checkAge(17);
        } catch (InvalidAgeCustomException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}

// Exception Class - this can be written in a separate java file
public class InvalidAgeCustomException extends Exception {
    public InvalidAgeCustomException(String msg) {
        super(msg);
    }
}
