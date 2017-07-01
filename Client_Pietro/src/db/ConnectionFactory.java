package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/client", "root", "5979");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}