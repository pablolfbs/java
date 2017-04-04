package view;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/*
 * Janela principal do sistema.
 */
public class MainFrame extends JFrame {	
	private JTable table;
	
	/*
	 * Construtor.
	 */
	public MainFrame() {
		build();
	}

	/*
	 * Constrói a janela.
	 */
	private void build() {
		setLayout(new GridBagLayout());
		buildMenu();
		setTitle("Gestão de Clientes");
		buildComponents();
		setSize(600, 400);
		setIconImage();
		setMinimumSize(new Dimension(400, 300));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	/*
	 * Constrói os componentes da janela.
	 */
	private void buildComponents() {
		buildMainPanel();
		buildButtonPanel();
	}

	/*
	 * Constrói o painel principal.
	 */
	private void buildMainPanel() {
		JPanel panel = new JPanel(new GridBagLayout());
		
		String[] itens = {"Nome", "CPF"};
		JComboBox<String> comboBox = new JComboBox<>(itens);
		panel.add(comboBox, new GBC(0, 0));
		
		JTextField searchField = new JTextField(20);
		panel.add(searchField, new GBC(1, 0).horizontal());
		
		buildTable(panel);
		
		add(panel, new GBC(0, 0).both().insets(10, 5, 5, 0));
	}

	/*
	 * Constrói a tabela.
	 */
	private void buildTable(JPanel panel) {
		table = new JTable();
		table.setModel(new ClientTableModel());
		JScrollPane scrollPane = new JScrollPane(table);
		panel.add(scrollPane, new GBC(0, 1).gridwh(2, 1).both());
	}

	/*
	 * Constrói painel de botões.
	 */
	private void buildButtonPanel() {
		JPanel panel = new JPanel(new GridBagLayout());
		
		JButton newButton = new JButton("Novo");
		panel.add(newButton, new GBC(1, 0).horizontal());
		newButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new ClientDialog(MainFrame.this);
			}
		});
		
		JButton editButton = new JButton("Atualizar");
		panel.add(editButton, new GBC(1, 1).horizontal());
		
		JButton deleteButton = new JButton("Apagar");
		panel.add(deleteButton, new GBC(1, 2).horizontal());
		
	}

	private void buildMenu() {
		
	}

	private void setIconImage() {
		
	}
}
