package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Client;

public class ClientDAO {

	private static void insert(Client client) {

		Connection con = ConnectionFactory.getConnection();

		try {
			PreparedStatement command = con.prepareStatement("INSERT INTO client VALUES (?, ?)");
			command.setString(1, client.getCpf());
			command.setString(2, client.getName());
			command.executeUpdate();
			command.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		insert(new Client("Judas", "12345678901", null));
	}
}
