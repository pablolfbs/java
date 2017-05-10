package enumeravel;

public class Person {
	
	enum Gender {
		MALE, FEMALE
	};
	
	private Gender gender;

	public Person(Gender gender) {
		super();
		this.gender = gender;
	}
	
}
