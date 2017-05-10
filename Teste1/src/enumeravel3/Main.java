package enumeravel3;

public class Main {
	
	public static void main(String[] args) {
		
		Person p =new Person(Gender.MALE);
		System.out.println(p.getGender());
		System.out.println(p.getGender().getValue());
		
	}

}
