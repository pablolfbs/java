package view;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AddClientDialog extends JDialog {
	
	public AddClientDialog(MainFrame mainFrame) {
		build(mainFrame);
	}

	private void build(MainFrame mainFrame) {
		setLayout(new GridBagLayout());
		addComponents();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		pack();
		setResizable(false);
		setLocationRelativeTo(mainFrame);
		setModal(true);
		setVisible(true);
	}

	private void addComponents() {
		JPanel panel = new JPanel(new GridBagLayout());
		JLabel nameButton = new JLabel("Nome: ");
		panel.add(nameButton, new GBC(0, 0).horizontal());
		JLabel cpfButton = new JLabel("CPF: ");
		panel.add(cpfButton, new GBC(0, 1).horizontal());
		JLabel birthButton = new JLabel("Nascimento: ");
		panel.add(birthButton, new GBC(0, 2).horizontal());
		JTextField searchField1 = new JTextField(20);
		panel.add(searchField1, new GBC(1, 0).horizontal());
		JTextField searchField2 = new JTextField(20);
		panel.add(searchField2, new GBC(1, 1).horizontal());
		JTextField searchField3 = new JTextField(20);
		panel.add(searchField3, new GBC(1, 2).horizontal());
		JButton saveButton = new JButton("Salvar");
		saveButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Salvo com sucessso!");
				AddClientDialog.this.dispose();
			}
		});
		panel.add(saveButton, new GBC(1, 3).right());
		add(panel, new GBC(0, 0));
	}
	
}
