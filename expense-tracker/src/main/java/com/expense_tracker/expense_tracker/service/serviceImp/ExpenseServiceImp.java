package com.expense_tracker.expense_tracker.service.serviceImp;

import com.expense_tracker.expense_tracker.entities.UserExpense;
import com.expense_tracker.expense_tracker.repositories.ExpenseRepositories;
import com.expense_tracker.expense_tracker.service.ExpenseService;
import com.expense_tracker.expense_tracker.specification.ExpenseSpecification;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ExpenseServiceImp implements ExpenseService {

    private ExpenseRepositories expenseRepositories;

    public ExpenseServiceImp(ExpenseRepositories expenseRepositories) {
        this.expenseRepositories = expenseRepositories;
    }

    @Override
    public void addExpense(UserExpense userExpense) {
        this.expenseRepositories.save(userExpense);
    }

    @Override
    public void updateExpense(UserExpense userExpense) {
        this.expenseRepositories.save(userExpense);
    }

    @Override
    public void deleteExpense(Long ExpenseId) {
        this.expenseRepositories.deleteById(ExpenseId);
    }

    @Override
    public List<UserExpense> getAllExpenseByCategoryName(String categoryName) {
        return expenseRepositories.findAll(ExpenseSpecification.byCategory(categoryName));
    }

    @Override
    public List<UserExpense> getAllExpenses() {
        return expenseRepositories.findAll();
    }

    @Override
    public List<UserExpense> filterByDate(String dateType) {
        return expenseRepositories.findAll(ExpenseSpecification.filterByDateType(dateType));
    }


}
