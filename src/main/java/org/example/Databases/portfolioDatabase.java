package org.example.Databases;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class portfolioDatabase {

    private static final String url = "jdbc:sqlite:database.db";

    public portfolioDatabase() throws SQLException {
    }

    public static void createPortfolioBalanceTable() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Portfolio ("
                + "balanceId INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "availableBalance INTEGER)";
                //+ "FOREIGN KEY (mealId) REFERENCES meals(mealId))"; // Link mealId to meals table;

        try (Connection connection = getConnection(url);
             Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
            System.out.println("Table Portfolio successfully created!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addBalance(float balance) {

    }
}
