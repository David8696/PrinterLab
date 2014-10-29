import java.util.ArrayList;

public class Printer {
	
	private ArrayList<String> printQueue;
	
	public Printer() {
		printQueue = new ArrayList<String>();
		
	}
	
	public void print(String whatToPrint) {
		System.out.println(whatToPrint);
	}
	
}
