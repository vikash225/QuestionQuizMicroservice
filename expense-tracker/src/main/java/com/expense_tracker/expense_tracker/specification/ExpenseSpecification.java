package com.expense_tracker.expense_tracker.specification;

import com.expense_tracker.expense_tracker.entities.UserExpense;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class ExpenseSpecification {
    public static Specification<UserExpense> byCategory(String category) {
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.
                equal(root.get("category"), category);
    }
    public static Specification<UserExpense> filterByDateType(String dateType) {
        return (root, query, criteriaBuilder) -> {
            LocalDate now = LocalDate.now();
            LocalDate startDate;
            LocalDate endDate = now;
            switch (dateType.toLowerCase()) {
                case "weekly":
                    startDate = now.minusDays(now.getDayOfWeek().getValue() % 7); // Start of this week
                    break;
                case "monthly":
                    startDate = now.withDayOfMonth(1); // Start of this month
                    break;
                case "yearly":
                    startDate = now.with(TemporalAdjusters.firstDayOfYear()); // Start of this year
                    break;
                default:
                    // If invalid dateType is passed, return all (or null to skip this filter)
                    return criteriaBuilder.conjunction();
            }
            return criteriaBuilder.between(root.get("ExpenseDate"), startDate, endDate);
        };
    }

}
