package enumeravel3;

public enum Gender {

	MALE("M"), FEMALE("F");
	
	private final String value;
	
	private Gender(String value) {
		 this.value = value;
	}
	
	public String getValue() {
		return value;
	}

}
