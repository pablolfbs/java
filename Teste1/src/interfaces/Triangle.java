package interfaces;

public class Triangle implements Shape {

	int side1Length;
	int side2Length;
	private int baseLength;
	private int height;

	public Triangle(int side1Length, int side2Length, int baseLength, int height) {
		super();
		this.side1Length = side1Length;
		this.side2Length = side2Length;
		this.baseLength = baseLength;
		this.height = height;
	}

	public int getSide1Length() {
		return side1Length;
	}

	public void setSide1Length(int side1Length) {
		this.side1Length = side1Length;
	}

	public int getSide2Length() {
		return side2Length;
	}

	public void setSide2Length(int side2Length) {
		this.side2Length = side2Length;
	}

	public int getBaseLength() {
		return baseLength;
	}

	public void setBaseLength(int baseLength) {
		this.baseLength = baseLength;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public float getArea() {
		return (baseLength * height) / 2;
	}
	
	@Override
	public int getPerimeter() {
		return baseLength + side1Length + side2Length;
	}

}
