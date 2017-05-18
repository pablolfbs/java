package heranca;

public class VolvoS60 extends Car {
	
	private boolean isTurbo = true;
	
	private static final int MAX_SPEED = 300;
	
	public VolvoS60(float accelaration) {
		super(accelaration);
	}
	
//	public float getAccelerationTurbo() {
//		if(isTurbo) {
//			return super.getAccelaration() * 1.4f;
//		}
//		return super.getAccelaration();
//	}
	
	public float getAcceleration() {
		if(isTurbo) {
			return super.getAccelaration() * 1.4f;
		}
		return super.getAccelaration();
	}

	public static void main(String[] args) {
		
//		VolvoS60 c = new VolvoS60(10);
//		c.getAccelaration();
//		System.out.println(c.getAccelaration());
		
		VolvoS60 v1 = new VolvoS60(3.5f);
		VolvoS60 v2 = new VolvoS60(4f);
//		v1.MAX_SPEED = 350;
		System.out.println(v1.MAX_SPEED);
		System.out.println(v2.MAX_SPEED);
		
	}
	
}
