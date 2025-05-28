package com.expense_tracker.expense_tracker.repositories;

import com.expense_tracker.expense_tracker.entities.UserExpense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ExpenseRepositories extends JpaRepository<UserExpense, Long>,JpaSpecificationExecutor<UserExpense> {

}
