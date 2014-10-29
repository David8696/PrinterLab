
public class User implements Runnable {
	
	private static int numberOfUsers;
	private int userId;
	private Printer printer;
	
	public User(Printer p) {
		numberOfUsers++;
		userId = numberOfUsers;
		
		printer = p;
		
	}
	
	public int getUserId() {
		return userId;
		
	}
	
	public void run() {
		printer.print("Print job from User " + userId);
		
	}
}
