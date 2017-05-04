package sobrecarga;

public class Util {	
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static float sum(float a, float b) {
		return a + b;
	}

	public static float sum(int a, float b) {
		return a + b;
	}

	public static double sum(double a, double b) {
		return a + b;
	}

	public static float sum(float a, int b) {
		return a + b;
	}	

	public static void main(String[] args) {
		System.out.println(Util.sum(10.10f, 10.2f));
		System.out.println(args[0]);
		System.out.println(args[1]);
		
	}
	
}
