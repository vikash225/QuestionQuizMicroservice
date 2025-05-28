package com.expense_tracker.expense_tracker.exception.allException;

public class NoUserExistsException extends RuntimeException {
    private String message;

    public NoUserExistsException(String message) {
        super(message);
        this.message = message;
    }
}
