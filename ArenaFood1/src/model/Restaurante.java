package model;
import java.util.HashSet;
import java.util.Set;

public class Restaurante {

	private String cpnj;
	
	private String nome;
	
	private String endereco;
	
	private String telefone;
	
	public Set<Avaliacao> avaliacao;
	 
	

	public Restaurante(String cpnj, String nome, String endereco, String telefone, Set<Avaliacao> avaliacao) {
		super();
		this.cpnj = cpnj;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.avaliacao = avaliacao;
	}



	public String getCpnj() {
		return cpnj;
	}



	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public Set<Avaliacao> getAvaliacao() {
		return avaliacao;
	}



	public void setAvaliacao(Set<Avaliacao> avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	@Override
	public String toString() {
		return "CNPJ: " + this.cpnj + " Nome: " + this.nome + " Endereço: " + this.endereco + " Telefone: " + this.telefone;
	}

}

