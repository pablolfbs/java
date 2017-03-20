package view;

import java.awt.Dimension;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * 
 * Janela principal do sistema.
 *
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
		setSize(400, 300);
		setMinimumSize(new Dimension(400, 300));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setIconImage();
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
