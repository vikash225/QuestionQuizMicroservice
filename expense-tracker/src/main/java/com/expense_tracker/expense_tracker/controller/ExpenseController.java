package com.expense_tracker.expense_tracker.controller;

import com.expense_tracker.expense_tracker.entities.UserExpense;
import com.expense_tracker.expense_tracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("expense")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/add-expense")
    public ResponseEntity<?> addExpense(@RequestBody UserExpense userExpense) {
        expenseService.addExpense(userExpense);
        return ResponseEntity.ok().build();
    }

    @GetMapping("filter/category/{category}")
    public List<UserExpense> getByCategory(@PathVariable String category) {
       return expenseService.getAllExpenseByCategoryName(category);
 }

 @GetMapping("/all-expense")
 public List<UserExpense> getAllExpense() {
        return  expenseService.getAllExpenses();
 }

 @GetMapping("filter/date/{dateType}")
    public List<UserExpense> getByDateType(@PathVariable String dateType) {
        return expenseService.filterByDate(dateType);
 }
}
