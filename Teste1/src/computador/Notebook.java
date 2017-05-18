package computador;

public class Notebook extends Computador {
	
	private String bateria;

	public Notebook(String cpu, String memoriaRam, String bateria) {
		super(cpu, memoriaRam);
		this.bateria = bateria;
	}

	public String getBateria() {
//		setBateria("1.0");
//		this.setBateria("1.0");
		return bateria;
	}

	public void setBateria(String f) {
		this.bateria = f;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nBateria: " + getBateria();
	}

}
