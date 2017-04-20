package computador;

public class Main {
	
	public static void main(String[] args) {
		
		Notebook notebook = new Notebook("4.0GHz", "2000MHz", "20min.");
		
		System.out.println(notebook.getCpu() + "\n" +
		notebook.getMemoriaRam() + "\n" + notebook.getBateria() + "\n");
		
		System.out.println(notebook);
		
	}

}
