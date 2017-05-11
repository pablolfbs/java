package enumeravel4;

public class Main {
	
	public static void main(String[] args) {
		
		Country t = new Country(Planet.TERRA, "Brasil");
		System.out.println(t);
		
		System.out.println();
		
		Country z = new Country(Planet.MARTE, "Zurion");
		System.out.println(z);
		
		System.out.println();
		
		Country w = new Country(Planet.JUPTER, "Oberion");
		System.out.println(w);
		
	}

}
