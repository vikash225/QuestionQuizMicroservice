package com.expense_tracker.expense_tracker.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "expense_tracker",schema = "expense_tracker_users")
public class UserExpense {
    @Id
    private Long ExpenseId;
    private String UserId;
    private LocalDate ExpenseDate;
    private String title;
    private String description;
    private String category;
    private Double amount;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setExpenseDate(LocalDate expenseDate) {
        ExpenseDate = expenseDate;
    }

    public LocalDate getExpenseDate() {
        return ExpenseDate;
    }

    public void setExpenseId(Long expenseId) {
        ExpenseId = expenseId;
    }
    public Long getExpenseId() {
        return ExpenseId;
    }
    public void setUserId(String userId) {
        UserId = userId;
    }
    public String getUserId() {
        return UserId;
    }

}
