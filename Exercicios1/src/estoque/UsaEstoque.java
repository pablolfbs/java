package estoque;

public class UsaEstoque {
	
	public static void main(String[] args) {
		
		Estoque estoque1 = new Estoque("Impressora Jato de tinta", 13, 6);
		Estoque estoque2 = new Estoque("Monitor LCD 17'", 11, 13);
		Estoque estoque3 = new Estoque("Mouse Óptico", 6, 2);
		
		estoque1.darBaixa(5);
		estoque2.repor(7);
		estoque3.darBaixa(4);
		System.out.println(estoque1.precisaRepor());
		System.out.println(estoque2.precisaRepor());
		System.out.println(estoque3.precisaRepor() + "\n");
		System.out.println(estoque1.mostra());
		System.out.println(estoque2.mostra());
		System.out.println(estoque3.mostra());
		estoque3.repor(5);
		System.out.println(estoque3.precisaRepor() + "\n");
		System.out.println(estoque3.mostra());
		
	}

}
