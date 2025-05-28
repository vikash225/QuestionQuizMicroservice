package com.expense_tracker.expense_tracker.service.serviceImp;

import com.expense_tracker.expense_tracker.entities.ExpenseTrackerUser;
import com.expense_tracker.expense_tracker.exception.allException.ApiResponse;
import com.expense_tracker.expense_tracker.exception.allException.UserAlreadyExistException;
import com.expense_tracker.expense_tracker.repositories.ExpenseUserRepositories;
import com.expense_tracker.expense_tracker.service.ExpenseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ExpenseUserServiceImp implements ExpenseUserService {

    @Autowired
    private ExpenseUserRepositories expenseUserRepositories;

    @Override
    public ExpenseTrackerUser SaveUser(ExpenseTrackerUser expenseTrackerUser) {

        if (expenseUserRepositories.findByEmail(expenseTrackerUser.getEmail()).isPresent()) {
            throw new UserAlreadyExistException("User already exist");
        }
       return expenseUserRepositories.save(expenseTrackerUser);
    }
}
