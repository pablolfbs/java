package banco;

public class Banco {
	
	private Conta[] contas;
	
	public void criarConta() {
		Conta[] contas = new Conta[10];
		for (int i = 0; i < contas.length; i++) {
			Conta c = new Conta();
			contas[i] = c;
		}
	}
	
	public void excluirConta() {

	}
	
	public void sacar() {

	}
	
	public void depositar() {

	}
	
	public void emitirSaldo() {

	}
	
	public void emitirExtrato() {

	}
	
	public void transferencia() {

	}

}
