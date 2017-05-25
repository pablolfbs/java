package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import model.Aposta;

public class ApostaTableModel extends DefaultTableModel {
	
	private String[] columnNames = { "Tabela", "Data da Partida"};

	private List<Aposta> aposta = new ArrayList<>();

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return null;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Aposta client = aposta.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return aposta.getJogo();
		case 1:
			return aposta.getDataPartida();
		}
		return "";
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub

	}

}
