package com.step.exception;

public class IllegalCharException extends Exception {
    public IllegalCharException(char alphabet) {
        super("Alphabet " + alphabet + " is not allowed for this alphabet set.");
    }
}
