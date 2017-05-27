package model;

public class Aposta {

	private String jogo;
	private String placar;
	private String valor;

	public Aposta(String jogo, String placar, String valor) {
		super();
		this.jogo = jogo;
		this.placar = placar;
		this.valor = valor;
	}

	public String getJogo() {
		return jogo;
	}

	public void setJogo(String jogo) {
		this.jogo = jogo;
	}

	public String getPlacar() {
		return placar;
	}

	public void setPlacar(String placar) {
		this.placar = placar;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
