package lampada;

public class Lampada {
	
	private boolean ligada;
	
	public void liga() {
		this.ligada = true;
	}
	
	public void desliga() {
		this.ligada = false;
	}
	
	public void observa() {
		if (ligada) {
			System.out.println("Ligada");
		} else {
			System.out.println("Desligada");
		}
	}
}