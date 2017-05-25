package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import model.Aposta;

public class ApostaTableModel extends DefaultTableModel {
	
	private String[] columnNames = {"Jogo", "Data da Partida"};

	private List<Aposta> apostas = new ArrayList<>();

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

//	@Override
//	public Object getValueAt(int rowIndex, int columnIndex) {
//		Aposta aposta = apostas.get(rowIndex);
//		switch (columnIndex) {
//		case 0:
//			return aposta.getJogo();
//		case 1:
//			return aposta.getDataPartida();
//		}
//		return "";
//	}
	
	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}

	@Override
	public boolean isCellEditable(int row, int column) {
		return false;
	}

	public Aposta getRow(int rowNumber) {
		return apostas.get(rowNumber);
	}

//	public void addAposta(Aposta aposta) {
//		apostas.add(aposta);
//		Object[] addData = { aposta.getJogo(), aposta.getDataPartida() };
//		this.addRow(addData);
//	}
//	
//	public void updateAposta(Aposta aposta, int selectedRow) {
//		for (Aposta a : apostas) {
//			if (a.equals(aposta)) {
//				a.setJogo(aposta.getJogo());
//				a.setDataPartida(aposta.getDataPartida());
//			}
//		}
//
//		// Falta atualiza o dado da tabela.
//		this.setValueAt(aposta.getJogo(), selectedRow, 0); // TODO criar
//															// constantes para
//															// isso.
//		this.setValueAt(aposta.getDataPartida(), selectedRow, 2);
//	}

}
