package view;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
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
import javax.swing.table.DefaultTableModel;

/**
 * Janela principal do sistema.
 */
public class MainFrame extends JFrame {

	/**
	 * Construtor.
	 */
	public MainFrame() {
		build();
	}

	/**
	 * Constrói a janela.
	 */
	private void build() {
		setLayout(new GridBagLayout());
		buildMenu();
		buildComponents();
		setSize(400, 300);
		setIconImage();
		setMinimumSize(new Dimension(400, 300));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * Constrói os componentes da janela.
	 */
	private void buildComponents() {
		buildSearchPanel();
		buildButtonPanel();
	}

	/**
	 * Constrói o painel de pesquisa.
	 */
	private void buildSearchPanel() {
		JPanel panel = new JPanel(new GridBagLayout());

		String[] itens = { "Nome", "CPF" };
		JComboBox<String> comboBox = new JComboBox<>(itens);
		panel.add(comboBox, new GBC(0, 0));

		JTextField searchField = new JTextField(20);
		panel.add(searchField, new GBC(1, 0).horizontal());

		JScrollPane scrollPane = new JScrollPane();
		JTable table = new JTable();
		scrollPane.add(table);
		panel.add(scrollPane, new GBC(0, 1).gridwh(2, 1).both());

		add(panel, new GBC(0, 0).both());
	}

	DefaultTableModel model = new DefaultTableModel(new Object[][] {
	      { "some", "text" }, { "any", "text" }, { "even", "more" },
	      { "text", "strings" }, { "and", "other" }, { "text", "values" } },
	      new Object[] { "Column 1", "Column 2" });

	/**
	 * Constrói o painel de botões.
	 */
	private void buildButtonPanel() {
		JPanel panel = new JPanel(new GridBagLayout());
		JButton newButton = new JButton("Novo");
		panel.add(newButton, new GBC(0, 0).horizontal());
		newButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AddClientDialog(MainFrame.this);
			}
		});

		JButton editButton = new JButton("Alterar");
		panel.add(editButton, new GBC(0, 1));

		JButton deleteButton = new JButton("Excluir");
		panel.add(deleteButton, new GBC(0, 2));

		add(panel, new GBC(1, 0));
	}

	/**
	 * Constrói o menu.
	 */
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

	/**
	 * Define a imagem da logo.
	 */
	private void setIconImage() {
		URL iconURL = getClass().getResource("/images/logo.jpg");
		ImageIcon icon = new ImageIcon(iconURL);
		setIconImage(icon.getImage());
	}

}
