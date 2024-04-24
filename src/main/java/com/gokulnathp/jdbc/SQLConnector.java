package com.gokulnathp.jdbc;

import java.sql.*;

public class SQLConnector {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("uri", "user", "password");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Student");

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + resultSet.getString(2));
        }

        String updateQuery = "INSERT INTO Students VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

        preparedStatement.setInt(1, 1);
        preparedStatement.setString(2, "Gokul");

        int count = preparedStatement.executeUpdate();
        System.out.println(count + " rows inserted.");

        statement.close();
        preparedStatement.close();
        connection.close();
    }
}
