package test;

import lista.ListaCircular;

public class Test {
	
	public static void main(String[] args) {
		
		ListaCircular myList = new ListaCircular();
		
		myList.addInicio(15);
		myList.addInicio(10);
		myList.addInicio(5);
		System.out.println(myList.toString());
		
		myList.addFinal(20);
		System.out.println(myList.toString());
		
		myList.add(2, 30);
		System.out.println(myList.toString());
		
		myList.removeInicio();
		myList.removeInicio();
		System.out.println(myList.toString());
		
		myList.removeFinal();
		System.out.println(myList.toString());
		
		myList.remove(1);
		System.out.println(myList.toString());

		myList.remove(0);
		System.out.println(myList.toString());
		
		myList.addInicio(40);
		System.out.println(myList.toString());
	}

}
