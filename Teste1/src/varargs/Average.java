package varargs;

public class Average {
	
	public static int average(int a, int b, int... others) {
		int result = a + b;
		for (int other : others) {
			result += other;
		}
		int average = result / (2 + others.length);		
		return average;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(average(3, 4));
		System.out.println(average(0, 2, 9));
		System.out.println(average(5, 7, 2, 4));
		System.out.println(average(8, 2, 9, 3, 1));
		System.out.println(average(1, 2, 7, 9, 5, 3));
	}

}
