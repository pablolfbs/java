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
		buildComponents();
		setSize(210, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	/*
	 * Constrói os componentes da janela.
	 */	
	private void buildComponents() {
		buildButtomPanel();
		buildResultPanel();
	}	

	private void buildResultPanel() {
		JPanel panel = new JPanel(new GridBagLayout());
		
		JTextField textField = new JTextField(16);
		panel.add(textField, new GBC(0, 0));
		
		add(panel, new GBC(0,0));
	}
	
	/*
	 * Constrói o painél de botões.
	 */
	private void buildButtomPanel() {
		JPanel panel = new JPanel(new GridBagLayout());
		
		JButton button1 = new JButton("1");
		panel.add(button1, new GBC(0, 1).both());
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				button1(getText().textField.setText());
			}
		});
		JButton button2 = new JButton("2");
		panel.add(button2, new GBC(1, 1).both());
		JButton button3 = new JButton("3");
		panel.add(button3, new GBC(2, 1).both());
		JButton button4 = new JButton("4");
		panel.add(button4, new GBC(0, 2).both());
		JButton button5 = new JButton("5");
		panel.add(button5, new GBC(1, 2).both());
		JButton button6 = new JButton("6");
		panel.add(button6, new GBC(2, 2).both());
		JButton button7 = new JButton("7");
		panel.add(button7, new GBC(0, 3).both());
		JButton button8 = new JButton("8");
		panel.add(button8, new GBC(1, 3).both());
		JButton button9 = new JButton("9");
		panel.add(button9, new GBC(2, 3).both());
		JButton button0 = new JButton("0");
		panel.add(button0, new GBC(1, 4).both());
		JButton buttonAdicao = new JButton("+");
		panel.add(buttonAdicao, new GBC(3, 3).both());
		JButton buttonSubtracao = new JButton("-");
		panel.add(buttonSubtracao, new GBC(3, 2).both());
		JButton buttonMultiplicacao = new JButton("*");
		panel.add(buttonMultiplicacao, new GBC(3, 1).both());
		JButton buttonDivisao = new JButton("/");
		panel.add(buttonDivisao, new GBC(3, 0).both());
		JButton buttonIgual = new JButton("=");
		panel.add(buttonIgual, new GBC(3, 4).both());
		JButton buttonDecimal = new JButton(",");
		panel.add(buttonDecimal, new GBC(0, 4).both());
		
		add(panel, new GBC(0, 1));
	}
	
	/*
	 * 
	 */
	private void buildMenu() {
		
	}

}
