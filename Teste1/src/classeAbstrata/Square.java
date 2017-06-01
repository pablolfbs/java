package classeAbstrata;

public class Square extends Shape {

	private int sideLength;
	private static final int SIDES = 4;

	public Square(int x, int y, int sideLength) {
		super(x, y);
		this.sideLength = sideLength;
	}

	public int getSideLength() {
		return sideLength;
	}

	public void setSideLength(int sideLength) {
		this.sideLength = sideLength;
	}

	public static int getSides() {
		return SIDES;
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
