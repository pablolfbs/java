
package banco;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Conta[] contas = new Conta[10];
		for (int i = 0; i < contas.length; i++) {
			
			Scanner in = new Scanner(System.in);
			
			Conta c = new Conta();
			c.setNumero(in.nextLine());
			System.out.println(c.getNumero());
		}
		
	}

}
