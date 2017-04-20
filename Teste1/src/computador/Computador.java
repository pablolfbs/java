package computador;

public class Computador {
	
	private String cpu;
	private String memoriaRam;
	
	public Computador(String cpu, String memoriaRam) {
		super();
		this.cpu = cpu;
		this.memoriaRam = memoriaRam;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(String memoriaRam) {
		this.memoriaRam = memoriaRam;
	}
	
	@Override
	public String toString() {
		return "CPU: " + getCpu() + "\nMemória: " + getMemoriaRam();
	}
	
}
