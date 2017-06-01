package interfaces;

public class Square implements Shape {

	private int sideLength;
	private static final int sides = 4;

	public Square(int sideLength) {
		super();
		this.sideLength = sideLength;
	}

	public int getSideLength() {
		return sideLength;
	}

	public void setSideLength(int sideLength) {
		this.sideLength = sideLength;
	}

	public static int getSides() {
		return sides;
	}

	@Override
	public float getArea() {
		return sideLength * sideLength;
	}

	@Override
	public int getPerimeter() {
		return sideLength + sideLength + sideLength + sideLength;
	}

}
