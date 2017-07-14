package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import com.mysql.jdbc.UpdatableResultSet;

import dao.ConnectionFactory;
import model.Restaurante;

public class RestauranteDao {

	public static void insert(Restaurante restaurante) {
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("INSERT INTO restaurante VALUES (?,?,?,?)");
			ps.setString(1, restaurante.getCpnj());
			ps.setString(2, restaurante.getEndereco());
			ps.setString(3, restaurante.getNome());
			ps.setString(4, restaurante.getTelefone());
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void update(Restaurante restaurante) {
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement ps = con
					.prepareStatement("UPDATE restaurante SET endereco = ?, nome = ?, telefone = ? WHERE cpnj = ?");
			ps.setString(1, restaurante.getEndereco());
			ps.setString(2, restaurante.getNome());
			ps.setString(3, restaurante.getTelefone());
			ps.setString(4, restaurante.getCpnj());
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Restaurante> select() {
		Connection con = ConnectionFactory.getConnection();
		ArrayList<Restaurante> restauranteArrayList = new ArrayList<>();
		try {
			PreparedStatement ps = con.prepareStatement("SELECT * FROM restaurante");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				restauranteArrayList.add(new Restaurante(rs.getString("cpnj"), rs.getString("nome"),
						rs.getString("endereco"), rs.getString("tel"), null));
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return restauranteArrayList;
	}

	public static boolean verificar(String cnpj){
		Connection con = ConnectionFactory.getConnection();
		ArrayList<Restaurante> restauranteArrayList = new ArrayList<>();
		try {
			PreparedStatement ps = 
					con.prepareStatement("SELECT * FROM restaurante WHERE cpnj = ?");
			ps.setString(1, cnpj);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				if (rs.getString("cpnj") == null) {
					return false;
				} else {
					return true;
				}
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
