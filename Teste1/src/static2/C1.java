package static2;

public class C1 {
	
	private int meuAtributo;
	
	public int soma1(int a, int b) {
		return a + b;
	}
	
	public static int soma2(int a, int b) {
//		System.out.println(meuAtributo);
//		soma1(1, 5);
		return a + b;
	}
	
	public static void main(String[] args) {
		
		new C1().soma1(1, 3);
		
		C1.soma2(1, 3);
		
	}
	
}
