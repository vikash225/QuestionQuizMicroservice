package com.expense_tracker.expense_tracker.exception;

import com.expense_tracker.expense_tracker.exception.allException.ApiResponse;
import com.expense_tracker.expense_tracker.exception.allException.UserAlreadyExistException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserAlreadyExistException.class)
    public ResponseEntity<ApiResponse> handleUserAlreadyExistException(UserAlreadyExistException exception) {
        ApiResponse apiResponse = new ApiResponse(false, exception.getMessage());
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.BAD_REQUEST);
    }


}