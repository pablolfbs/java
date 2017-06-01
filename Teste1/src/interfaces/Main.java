package interfaces;

public class Main {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[4];
		shapes[0] = new Square(10);
		shapes[1] = new Square(8);
		shapes[2] = new Triangle(3, 4, 3, 4);
		shapes[3] = new Triangle(5, 2, 4, 2);
		for (Shape shape : shapes) {
			System.out.println(shape.getArea());
		}
	}
}
