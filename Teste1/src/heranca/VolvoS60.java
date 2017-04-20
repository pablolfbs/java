package heranca;

public class VolvoS60 extends Car {
	
	private boolean isTurbo = true;
	
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
		
		VolvoS60 c = new VolvoS60(10);
		c.getAccelaration();
		System.out.println(c.getAccelaration());
	}
	
}
