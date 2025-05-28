package com.expense_tracker.expense_tracker.exception.allException;

public class UserAlreadyExistException extends RuntimeException{
    public UserAlreadyExistException(String message){
        super(message);
    }
}
