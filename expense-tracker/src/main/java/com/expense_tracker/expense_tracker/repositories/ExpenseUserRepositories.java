package com.expense_tracker.expense_tracker.repositories;

import com.expense_tracker.expense_tracker.entities.ExpenseTrackerUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface ExpenseUserRepositories extends JpaRepository<ExpenseTrackerUser, Long>, JpaSpecificationExecutor<ExpenseTrackerUser> {
    Optional<ExpenseTrackerUser> findByEmail(String email);
}
