package view;

import java.awt.GridBagLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import model.Aposta;

public class JogosDialog extends JDialog {
	
	private MainFrame mainFrame;
	private int selectedRow;
	private Jogos jogos;
	
	public JogosDialog(MainFrame mainFrame) {
		this(mainFrame, null, 0);
	}

	public JogosDialog(MainFrame mainFrame, Jogos jogos, int selectedRow) {
		this.mainFrame = mainFrame;
		this.jogos = jogos;
		this.selectedRow = selectedRow;
		build();
	}

	private void build() {
		setLayout(new GridBagLayout());
		buildComponents();
		pack();
		setResizable(false);
		setTitle("Jogos");
		setLocationRelativeTo(mainFrame);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setModal(true);
		setVisible(true);
	}

	private void buildComponents() {
		JLabel jogoLabel = new JLabel("Jogo1:");
		add(jogoLabel, new GBC(0, 0).left().insets(10, 10, 0, 0));
		

		JLabel placarLabel = new JLabel("Jogo2:");
		add(placarLabel, new GBC(0, 1).left().insets(10, 10, 0, 0));
		

		JLabel valorLabel = new JLabel("Jogo3:");
		add(valorLabel, new GBC(0, 2).left().insets(10, 10, 0, 0));
	}
		
}