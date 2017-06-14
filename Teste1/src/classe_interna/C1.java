package classe_interna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class C1 {
	
	public C1() {
//		new JButton().addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
		
		new JButton().addActionListener(new MeuActionListener());
		
	}

}
