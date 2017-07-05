package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Client;

public class ClientDAO {

	public static void insert(Client client) {

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

	public static void update(Client client) {

		Connection con = ConnectionFactory.getConnection();

		try {
			PreparedStatement command = con.prepareStatement("UPDATE client SET name = ? WHERE cpf = ?");
			command.setString(1, client.getName());
			command.setString(2, client.getCpf());
			command.executeUpdate();
			command.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void delete(Client client) {

		Connection con = ConnectionFactory.getConnection();

		try {
			PreparedStatement command = con.prepareStatement("DELETE FROM client WHERE cpf = ?");
			command.setString(1, client.getCpf());
			command.executeUpdate();
			command.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Client> select() {
		ArrayList<Client> select = new ArrayList<Client>();

		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement command = con.prepareStatement("SELECT * FROM client");
			ResultSet rs = command.executeQuery();
			while (rs.next()) {
				select.add(new Client(rs.getString("name"), rs.getString("cpf"), null));
			}
			rs.close();
			command.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return select;
	}

	public static void Print(ArrayList<Client> list) {
		for (Client client : list) {
			System.out.println("CPF: " + client.getCpf() + "    " + "Nome: " + client.getName());
		}
	}

	public static void main(String[] args) {
//		insert(new Client("Judas", "12345678901", null));
//		insert(new Client("Pablo", "12345678902", null));
//		update(new Client("João", "12345678901", null));
//		delete(new Client("João", "12345678901", null));
//		delete(new Client("Pablo", "12345678902", null));
//		Print(select());
	}
}
