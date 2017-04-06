package test;

import lista.ListaCircular;

public class Test {
	
	public static void main(String[] args) {
		
		ListaCircular lc = new ListaCircular();
		
		lc.addInicio(10);
		System.out.println(lc.toString());
		
		lc.addFinal(20);
		System.out.println(lc.toString());
		
		lc.add(0, 30);
		System.out.println(lc.toString());
		
		lc.removeInicio();
		System.out.println(lc.toString());
		
		lc.removeFinal();
		System.out.println(lc.toString());
		
		lc.remove(0);
		System.out.println(lc.toString());
		
		lc.add(0, 40);
		System.out.println(lc.toString());
	}

}
