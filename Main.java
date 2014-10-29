
public class Main implements Runnable {
	
	private Printer printer;
	
	public static void main(String[] args) {
		
		Printer printer = new Printer();
		Thread mainThread = new Thread();
		mainThread.start();
			
	}
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			User u = new User(printer);
			Thread thread = new Thread();
			thread.start();
		}
		
	}

}
