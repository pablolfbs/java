package view;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import model.Aposta;

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

	private void buildMainPanel() {
		JPanel panel = new JPanel(new GridBagLayout());

		buildTable(panel);

		add(panel, new GBC(0, 0).both().insets(10, 5, 5, 0));
	}

	private void buildButtonPanel() {
		JPanel panel = new JPanel(new GridBagLayout());
		
		JButton updateButton = new JButton("Atualizar Jogos");
		panel.add(updateButton, new GBC(0, 0).horizontal());
		updateButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				updateButton(e);
			}

			private void updateButton(ActionEvent e) {
				repaint();
			}
		});
		
		JButton apostaButton = new JButton("Apostar");
		panel.add(apostaButton, new GBC(0, 1));
		apostaButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ApostaDialog(MainFrame.this);
			}
		});
		add(panel, new GBC(1, 0));
	}

	private void buildTable(JPanel panel) {
		table = new JTable();
		table.setModel(new ApostaTableModel());
		JScrollPane scrollPane = new JScrollPane(table);
		panel.add(scrollPane, new GBC(0, 1).gridwh(2, 1).both());
	}

	private void buildMenu() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu helpMenu = new JMenu("Ajuda");
		menuBar.add(helpMenu);
		JMenuItem aboutItem = new JMenuItem("Sobre");
		helpMenu.add(aboutItem);
		aboutItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AboutDialog(MainFrame.this);
			}
		});

		JMenuItem exitItem = new JMenuItem("Sair");
		helpMenu.add(exitItem);
		exitItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void addAposta(Aposta aposta) {
		ApostaTableModel model = (ApostaTableModel) table.getModel();
		model.addAposta(aposta);
	}
}
