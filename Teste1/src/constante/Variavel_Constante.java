package constante;

public class Variavel_Constante {

	public static void main(String[] args) {
//		int a = 10;
//		a = 20;
//		a = 30;
//		
//		final int B = 55;
//		B = 60; // Erro de compilação.
//
//		private void m1() {
//		int a = 10;
//		{
//		int b = 30;
//		}
//		System.out.println(b);
//		}

		int numbers[] = new int[10];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		numbers[5] = 6;
		numbers[6] = 7;
		numbers[7] = 8;
		numbers[8] = 9;
		numbers[9] = 10;
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
