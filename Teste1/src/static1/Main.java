package static1;

public class Main {
	
	public static void main(String[] args) {
		Client c1 = new Client("Fabrício");
		Client c2 = new Client("Claudio");
		Client c3 = new Client();
		System.out.println("c1: " + c1.getName());
		System.out.println("c2: " + c2.getName());
		
		if(80 > Client.MIN_SCORE) {
			//passou de fase
		} else {
			//continua tentando
		}
	}

}
