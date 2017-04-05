package static1;

public class Array {

	public static void main(String[] args) {

		float[] salarios = { 100f, 1000f, 2000f, 3000f, 2500f, 5000f, 6400f, 3000f, 2000f, 3000f };
		for (int i = 0; i < salarios.length; i++) {
			System.out.println(salarios[i]);
		}

		boolean expression = true;
		int a = 0;
		if (expression) {
			a = 3;
		} else {
			System.out.println(a);
			int b = 5;
		}
//		int c = a + b;

	}

}
