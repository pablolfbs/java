package view;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Aposta;

public class ApostaDialog extends JDialog {
	
	private MainFrame mainFrame;
	private JTextField jogoField;
	private JTextField timeField;
	private JTextField valorField;
	private int selectedRow;
	private Aposta aposta;
	
	public ApostaDialog(MainFrame mainFrame) {
		this(mainFrame, null, 0);
	}

	public ApostaDialog(MainFrame mainFrame, Aposta aposta, int selectedRow) {
		this.mainFrame = mainFrame;
		this.aposta = aposta;
		this.selectedRow = selectedRow;
		build();
	}

	private void build() {
		setLayout(new GridBagLayout());
		buildComponents();
		pack();
		setResizable(false);
		setTitle("Apostar");
		setLocationRelativeTo(mainFrame);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setModal(true);
		setVisible(true);
	}

	private void buildComponents() {
		JLabel jogoLabel = new JLabel("Jogo:");
		add(jogoLabel, new GBC(0, 0).left().insets(10, 10, 0, 0));
		jogoField = new JTextField(20);
		add(jogoField, new GBC(1, 0).insets(10, 10, 0, 0));

		JLabel timeLabel = new JLabel("Time:");
		add(timeLabel, new GBC(0, 1).left().insets(10, 10, 0, 0));
		timeField = new JTextField(20);
		add(timeField, new GBC(1, 1).insets(10, 10, 0, 0));

		JLabel valorLabel = new JLabel("Valor da Aposta:");
		add(valorLabel, new GBC(0, 2).left().insets(10, 10, 0, 0));
		valorField = new JTextField(20);
		add(valorField, new GBC(1, 2).insets(10, 10, 0, 0));

		JButton saveButton = new JButton("Salvar");
		add(saveButton, new GBC(1, 3).right().insets(10, 10, 0, 0));
		saveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					mainFrame.addAposta(getAposta());
				ApostaDialog.this.dispose();
			}

			private Aposta getAposta() {
				return new Aposta(jogoField.getText(), timeField.getText(), valorField.getText());
			}
		});
		
		if(aposta != null) {
			setFields();
		}
	}
	
	private void setFields() {
		jogoField.setText(aposta.getJogo());
		timeField.setText(aposta.getTime());
		timeField.setEnabled(false);
		valorField.setText(aposta.getValor());
	}
	
	private Aposta getAposta() {
		return new Aposta(jogoField.getText(), timeField.getText(), valorField.getText());
	}
		
}
