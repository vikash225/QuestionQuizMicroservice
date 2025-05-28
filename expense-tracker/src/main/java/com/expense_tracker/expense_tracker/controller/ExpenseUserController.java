package com.expense_tracker.expense_tracker.controller;


import com.expense_tracker.expense_tracker.entities.ExpenseTrackerUser;
import com.expense_tracker.expense_tracker.exception.allException.ApiResponse;
import com.expense_tracker.expense_tracker.exception.allException.UserAlreadyExistException;
import com.expense_tracker.expense_tracker.service.ExpenseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class ExpenseUserController {

    private final ExpenseUserService expenseUserService;

    public ExpenseUserController(ExpenseUserService expenseUserService) {
        this.expenseUserService = expenseUserService;
    }

    @PostMapping(value = "/register")
    public ResponseEntity<?> SaveUser(@RequestBody ExpenseTrackerUser user) {
        System.out.println(user);
        expenseUserService.SaveUser(user);
        ApiResponse response = new ApiResponse(true, "User registered successfully");
        return ResponseEntity.ok(response);
    }

}
