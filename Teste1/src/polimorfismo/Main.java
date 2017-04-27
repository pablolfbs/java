package polimorfismo;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
//		Person p = new Student();
////		Student p = new Person(); // erro de compilação
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
				
		Employee[] p = new Employee[5];
		
		for (int i = 0; i < 3; i++) {
			
		}
		for (Employee e : p) {
			e = new Professor("João", 10, 10);
			System.out.println(e.getSalary());			
		}
		
	}
	
}
