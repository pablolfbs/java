
public class Agenda {
	
	private Contato[] contatos;
	private String nome;
	
	public Agenda() {
		super();
	}
	public Agenda(String nome) {
		super();
		this.nome = nome;
	}	
	public Contato[] getContatos() {
		return contatos;
	}	
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}	
	public String getNome() {
		return nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String obterInfo() {
		String info = "Nome da agenda: " + nome + "\n";
		if (contatos != null) {
			for (Contato c : contatos) {
				info += c + "\n";
			}
		}
		return info;
	}
	
}
