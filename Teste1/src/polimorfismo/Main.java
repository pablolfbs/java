package polimorfismo;

public class Main {
	
	public static void main(String[] args) {
		
//		Person p = new Student();
//		Student p = new Person(); // erro de compilação
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
		
		e[0] = new Professor("João", 160, 20);
		e[1] = new Professor("Maria", 200, 20);
		e[2] = new Professor("José", 100, 30);
		e[3] = new Secretary("Mário", 1000, 200);
		e[4] = new Secretary("Roberto", 2000, 500);
		
		for (Employee em : e) {
			System.out.println(em);
		}
		
	}
	
}
