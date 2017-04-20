package pais;

import java.util.ArrayList;

public class Pais {
	
	private ArrayList<Fronteira> fronteiras;
	private String nome;
	private String capital;
	private float dimensao;
	
	public Pais(String nome, String capital, float dimensao) {
		super();
		this.nome = nome;
		this.capital = capital;
		this.dimensao = dimensao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public float getDimensao() {
		return dimensao;
	}

	public void setDimensao(float dimensao) {
		this.dimensao = dimensao;
	}
	
	public	boolean	equals(final Pais outro) {
		return false;
	}	
}
