package polimorfismo;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
//		Person p = new Student();
////		Student p = new Person(); // erro de compila��o
//		Student s = new Student();
//		
//		Student s1 = new Student();
//		s1.m1();
//		
//		Person p1 = new Student();
//		p1.m1();
//		
//		Person p2 = new Person();
//		p2.m1();
				
		Employee[] e = new Employee[5];
		
		e[0] = new Professor("Jo�o", 10, 10);
		e[0] = new Professor("Jo�o", 10, 10);
		e[0] = new Professor("Jo�o", 10, 10);
		e[0] = new Secretary("Jo�o", 1000, 200);
		e[0] = new Secretary("Jo�o", 2000, 500);
		
		for (Employee em : e) {
			System.out.println(em);
		}
		
	}
	
}
