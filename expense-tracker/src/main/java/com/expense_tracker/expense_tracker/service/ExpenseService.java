package com.expense_tracker.expense_tracker.service;

import com.expense_tracker.expense_tracker.entities.UserExpense;

import java.util.List;

public interface ExpenseService {
    void addExpense(UserExpense userExpense);
    void updateExpense(UserExpense userExpense);
    void deleteExpense(Long ExpenseId);
    List<UserExpense> getAllExpenseByCategoryName(String categoryName);
    List<UserExpense>getAllExpenses();
    List<UserExpense>filterByDate(String dateType);
}
