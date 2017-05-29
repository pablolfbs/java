package view;

import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JogosDialog extends JDialog {
	
	private MainFrame mainFrame;
	
	public JogosDialog(MainFrame mainFrame) {
		this(mainFrame, null, 0);
	}

	public JogosDialog(MainFrame mainFrame, Jogos jogos, int selectedRow) {
		this.mainFrame = mainFrame;
		build();
	}

	private void build() {
		setLayout(new GridBagLayout());
		buildComponents();
		pack();
		setResizable(false);
		setTitle("Jogos da Rodada");
		setLocationRelativeTo(mainFrame);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setModal(true);
		setVisible(true);
	}

	private void buildComponents() {
		JLabel jogo1Label = new JLabel("Jogo1: Coritiba x Atlético-PR");
		add(jogo1Label, new GBC(0, 0).left().insets(10, 10, 0, 0));
		
		JLabel jogo2Label = new JLabel("Jogo2: Corinthians x Santos");
		add(jogo2Label, new GBC(0, 1).left().insets(10, 10, 0, 0));

		JLabel jogo3Label = new JLabel("Jogo3: Fluminense x Vitória");
		add(jogo3Label, new GBC(0, 2).left().insets(10, 10, 0, 0));
		
		JLabel jogo4Label = new JLabel("Jogo4: Flamengo x Botafogo");
		add(jogo4Label, new GBC(0, 3).left().insets(10, 10, 0, 0));

		JLabel jogo5Label = new JLabel("Jogo5: Avaí x Sport");
		add(jogo5Label, new GBC(0, 4).left().insets(10, 10, 0, 0));
		
		JLabel jogo6Label = new JLabel("Jogo6: Palmeiras x Atlético-MG");
		add(jogo6Label, new GBC(1, 0).left().insets(10, 10, 0, 0));

		JLabel jogo7Label = new JLabel("Jogo7: Grêmio x Vasco");
		add(jogo7Label, new GBC(1, 1).left().insets(10, 10, 0, 0));
		
		JLabel jogo8Label = new JLabel("Jogo8: Ponte Preta x São Paulo");
		add(jogo8Label, new GBC(1, 2).left().insets(10, 10, 0, 0));
		
		JLabel jogo9Label = new JLabel("Jogo9: Cruzeiro x Chapecoense");
		add(jogo9Label, new GBC(1, 3).left().insets(10, 10, 0, 0));
		
		JLabel jogo10Label = new JLabel("Jogo10: Bahia x Atlético-GO");
		add(jogo10Label, new GBC(1, 4).left().insets(10, 10, 0, 0));
	}
		
}