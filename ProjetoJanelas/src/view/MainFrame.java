package view;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

public class MainFrame extends JFrame {
	
	private JTable table;
	
	public MainFrame() {
		build();
	}

	public void build() {
		setLayout(new GridBagLayout());
		buildMenu();
		setTitle("Calculadora");
		buildComponents();
		setResizable(false);
		setSize(400, 300);
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

	private void buildMainPanel() {
		
	}

	private void buildMenu() {
		
	}

}
