package com.collable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallStoredProcedure {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		CallableStatement callableStatement = null;
		Connection connection = null;

		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		System.out.println("Connected to the database.");

		String sql = "{CALL insert_records()}";
		callableStatement = connection.prepareCall(sql);

		boolean hasResultSet = callableStatement.execute();

		while (hasResultSet) {
			ResultSet resultSet = callableStatement.getResultSet();
			while (resultSet.next()) {
				String message = resultSet.getString("message");
				System.out.println("Message: " + message);
			}
			hasResultSet = callableStatement.getMoreResults();
		}

	}
}
