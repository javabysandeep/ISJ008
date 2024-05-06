package com.itshaala.dao;

import com.itshaala.model.Expense;
import com.itshaala.util.ConnectionUtil;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.Statement;

public class ExpenseDao {
   @SneakyThrows
    public void addExpense(Expense expense) {
        Connection connection = ConnectionUtil.getConnection();
        Statement statement = connection.createStatement();
       String sqlQuery = "insert into isj009.expense(id, title, amount, notes, expense_date) VALUES (" + expense.getId() + ",'" + expense.getTitle() + "'," +
               expense.getAmount() + ",'" + expense.getNotes() + "'," + expense.getExpenseDate() + ")";
       statement.executeUpdate(sqlQuery);
        connection.close();
       System.out.println("Expenses Added");
    }

    //update, delete, select all expenses.
}
