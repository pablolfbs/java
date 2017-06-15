package generics;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class C {
	
	public static void main(String[] args) {
		
		List<ActionListener> l = new ArrayList<>();
		ActionListener e = l.get(0);
	
	}
	

}
