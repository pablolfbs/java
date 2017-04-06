package static1;

public class Client {
	
	private int a;
	private boolean b;
	private float c;
	
	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	private static String name;
	public static final int MIN_SCORE = 70;

	public Client() {
	}
	
	public Client(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public class C2 {
		
	}
	
}
