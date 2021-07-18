import java.util.Scanner;

public class BankDriver {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//Loop control
		boolean done = false;
		
		//change to User
		String user = null;
		
		while(!done) {
			if(user==null) {
				System.out.println("Login or Create new account? Press 1 to Login. Press 2 to create new account.");
				int choice = Integer.parseInt(in.nextLine());
				if(choice==1) {
					System.out.print("Please enter your username: ");
					String username = in.nextLine();
					System.out.print("Please enter your password: ");
					String password = in.nextLine();

				} else {
					System.out.print("Please enter you first name: ");
					String first = in.nextLine();
					System.out.println("Please enter your last name: ");
					String last = in.nextLine();
					System.out.println("Please enter a password: ");
					String password = in.nextLine();
					}
			}
	
		System.out.println("Goodbye :)");
		in.close();
				
}
	}}
	
