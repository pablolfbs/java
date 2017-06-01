
public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Entre com o nome da agenda: ");
		
		Agenda agenda = new Agenda();
		agenda.setNome("Agenda");
		
		Contato[] contatos = new Contato[3];
		
		for (int i = 0; i < contatos.length; i++) {
			System.out.println("Entre com as informa��es do contato " + (i + 1) + ":");
			Contato c = new Contato();
			
			c.setNome("Jo�o");
			c.setTelefone("123");
			c.setEmail("joao@joao");
			
			System.out.println(c + "\n");
			
			contatos[i] = c;
		}
		agenda.setContatos(contatos);
		
		if (agenda != null) {
			System.out.print(agenda.obterInfo());
			
		}
		
	}

}
