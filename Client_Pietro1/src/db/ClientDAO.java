package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Client;

public class ClientDAO {

	public static boolean Insert(Client client) {
		Connection con = ConnectionFactory.getConnection();

		try {

			PreparedStatement command = con.prepareStatement("INSERT INTO CLIENT VALUES (?, ?)");

			command.setString(1, client.getCpf());
			command.setString(2, client.getName());
			command.executeUpdate();
			command.close();
			con.close();
			return true;
		} catch (SQLException e) {

			e.printStackTrace();
			return false;
		}
	}

	public static void Update(Client client) {
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

	public static ArrayList<Client> select() {
		Connection conexao = ConnectionFactory.getConnection();;
		ArrayList<Client> list = new ArrayList<>();

		try {

			PreparedStatement command = conexao.prepareStatement("SELECT * FROM client");

			ResultSet rs = command.executeQuery();

			while (rs.next()) {
				list.add(new Client(rs.getString("name"), rs.getString("cpf"), null));
				
			}

			rs.close();
			command.close();
			
		

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return list;
	}

	public static boolean Remove(Client client) {
		Connection con = ConnectionFactory.getConnection();

		try {

			PreparedStatement command = con.prepareStatement("DELETE FROM client WHERE cpf = ?");

			command.setString(1, client.getCpf());
			command.executeUpdate();
			command.close();
			con.close();
			return true;
		} catch (SQLException e) {

			e.printStackTrace();
			return false;
		}
	}
	
	
	public static void Print(ArrayList<Client> list){
	
		for (Client client : list) {
			System.out.println("CPF: " + client.getCpf() + " " + "Nome: " + client.getName() + "\n"); 
		}
		
	}

	public static void main(String[] args) {
		Print(select());
		

	}

}
