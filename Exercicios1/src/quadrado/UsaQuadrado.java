package quadrado;

public class UsaQuadrado {
	
	private static double area;
	private static double perimetro;

	public static void main(String[] args) {
		
		Quadrado q1 = new Quadrado(2);
		Quadrado q2 = new Quadrado(4);
		Quadrado q3 = new Quadrado(5);
		
		System.out.println(q1.area(area));
		System.out.println(q1.perimetro(perimetro));
		System.out.println(q2.area(area));
		System.out.println(q2.perimetro(perimetro));
		System.out.println(q3.area(area));
		System.out.println(q3.perimetro(perimetro));
	}

}
