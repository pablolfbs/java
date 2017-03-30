package static1;

public class Client {
	
	private static String name;
	public static final int MIN_SCORE = 70;

	public Client() {
	}
	
	public Client(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
