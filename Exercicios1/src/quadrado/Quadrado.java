package quadrado;

public class Quadrado {
	
	private double lado;

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}
	
	public double area(double area) {
		area = lado * lado;
		return area;
	}
	
	public double perimetro(double perimetro) {
		perimetro = 4 * lado;
		return perimetro;
	}
}
