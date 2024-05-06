package com.itshaala;

import com.itshaala.controller.ExpenseController;
import com.itshaala.model.Expense;

public class ExpenseApp {
    public static void main(String[] args) {
        ExpenseController expenseController = new ExpenseController();

        Expense expense = Expense.builder()
                .id(101)
                .title("dinner")
                .amount(5500)
                .notes("italian pasta")
                .build();

        expenseController.addExpense(expense);
    }
}
