package view;

import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MainFrame extends JFrame {

	private JTable table;
	
	public MainFrame() {
		build();
	}

	private void build() {
		setLayout(new GridBagLayout());
		buildMenu();
		setTitle("Central de Apostas");
		buildComponents();
		setSize(600, 400);
		setMinimumSize(new Dimension(400, 300));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void buildComponents() {
		buildMainPanel();
		buildButtonPanel();
	}


	private void buildButtonPanel() {
		
	}

	private void buildTable(JPanel panel) {
		table = new JTable();
		table.setModel(new ApostaTableModel());
		JScrollPane scrollPane = new JScrollPane(table);
		panel.add(scrollPane, new GBC(0, 1).gridwh(2, 1).both());
	}

	private void buildMainPanel() {
		
	}

	private void buildMenu() {
		
	}

}

