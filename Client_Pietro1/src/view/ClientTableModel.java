package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import db.ClientDAO;
import model.Client;

public class ClientTableModel extends DefaultTableModel {

	private String[] columnNames = { "Nome", "CPF", "Data de Nascimento" };

	private List<Client> clients = new ArrayList<>();

	public ClientTableModel() {
		atualizaBanco(ClientDAO.select());
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Client client = clients.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return client.getName();
		case 1:
			return client.getCpf();
		case 2:
			return client.getBirthday();
		}
		return "";
	}

	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}

	@Override
	public boolean isCellEditable(int row, int column) {
		return false;
	}

	/**
	 * Recupera um cliente com base na numera��o da linha.
	 * 
	 * @param rowNumber
	 *            N�mero da linha.
	 * @return Cliente.
	 */
	public Client getRow(int rowNumber) {
		return clients.get(rowNumber);
	}

	/**
	 * Adiciona um cliente.
	 * 
	 * @param client
	 *            Cliente.
	 */
	public void addClient(Client client) {
		boolean done = ClientDAO.Insert(client); // m�todo para adicionar
													// cliente no banco de dados
		if (done) {

			clients.add(client);
			Object[] clientData = { client.getName(), client.getCpf(), client.getBirthday() };
			this.addRow(clientData);
		}
	}

	public void atualizaBanco(ArrayList<Client> list) {

		for (Client client : list) {
			clients.add(client);
			Object[] clientData = { client.getName(), client.getCpf(), client.getBirthday() };
			this.addRow(clientData);
		}
	}

	/**
	 * Atualiza um cliente.
	 * 
	 * @param client
	 *            Cliente.
	 * @param selectedRow
	 *            Linha selecionada pelo usu�rio.
	 */
	public void updateClient(Client client, int selectedRow) {
		for (Client c : clients) {
			if (c.equals(client)) {
				c.setName(client.getName());
				c.setBirthday(client.getBirthday());
				ClientDAO.Update(client); // M�todo para atualizar cliente no
											// banco de dados.
			}
		}

		// Falta atualiza o dado da tabela.
		this.setValueAt(client.getName(), selectedRow, 0); // TODO criar
															// constantes para
															// isso.
		this.setValueAt(client.getBirthday(), selectedRow, 2);
	}

	/**
	 * Remove um cliente.
	 * 
	 * @param selectedRow
	 *            Linha selecionada pelo usu�rio.
	 */
	public void removeClient(int selectedRow) {
		clients.remove(selectedRow);
		this.removeRow(selectedRow);
	}

}
