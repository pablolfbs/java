package enumeravel4;

public enum Planet {
	
	TERRA(10.0f, 5.0f), MARTE(20.0f, 15.0f), JUPTER(20.0f, 30.0f);

	private final float radius;
	private final float gravity;

	private Planet(float radius, float gravity) {
		this.radius = radius;
		this.gravity = gravity;
	}
	
	public float getRadius() {
		return radius;
	}
	
	public float getGravity() {
		return gravity;
	}
	
}
