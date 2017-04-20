package computador;

public class Notebook extends Computador {
	
	private String bateria;

	public Notebook(String cpu, String memoriaRam, String bateria) {
		super(cpu, memoriaRam);
		this.bateria = bateria;
	}

	public String getBateria() {
		return bateria;
	}

	public void setBateria(String bateria) {
		this.bateria = bateria;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nBateria: " + getBateria();
	}

}
