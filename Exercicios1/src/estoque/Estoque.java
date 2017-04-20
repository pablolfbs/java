package estoque;

public class Estoque {

	private String nome;
	private int qtdAtual;
	private int qtdMinima;

	public Estoque() {
		super();
	}

	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		super();
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}

	public void mudarNome(String nome) {
		
	}

	public void mudarQtdMinima(int qtdMinima) {
		
	}

	public void repor(int qtd) {
		qtdAtual += qtd;
	}

	public void darBaixa(int qtd) {
		qtdAtual -= qtd;
	}

	public String mostra() {
		return "Nome: " + this.nome + "\nQuantidade Atual: "+
				this.qtdAtual + "\nQuantidade Mínima: " + this.qtdMinima + "\n";
	}

	public boolean precisaRepor() {
		if (qtdAtual <= qtdMinima) {
			return true;
		} else {
			return false;
		}
	}

}
