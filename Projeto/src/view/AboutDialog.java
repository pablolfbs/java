package view;

import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AboutDialog extends JDialog {
	
	public AboutDialog(MainFrame mainFrame) {
		build(mainFrame);
	}

	private void build(MainFrame mainFrame) {
		addComponents();
		setSize(300, 200);
		setMinimumSize(new Dimension(300, 200));
		setLocationRelativeTo(mainFrame);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	private void addComponents() {
		String s = "Programa de Apostas - Versão 1.0";
		JLabel label = new JLabel(s);
		add(label);
	}

}
