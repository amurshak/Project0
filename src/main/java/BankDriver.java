import java.util.List;
import java.util.Scanner;

import com.example.exceptions.InvalidCredentialsException;
import com.example.models.User;
import com.example.services.UserService;

public class BankDriver {
	
	private static UserService uServ = new UserService("users.txt");
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//This will be used to control our loop
		boolean done = false;
		
		User u = null;
		
		while(!done) {
			if(u == null) {
				System.out.println("Login or Signup? Press 1 to Login, Press 2 to Signup");
				int choice = Integer.parseInt(in.nextLine());
				if(choice == 1) {
					System.out.print("Please enter your username: ");
					String username = in.nextLine();
					System.out.print("Please enter your password: ");
					String password = in.nextLine();
					try {
						u = uServ.login(username, password);
						System.out.println("Welcome " + u.getFirstName());
					} catch(Exception e) {
						System.out.println("Username or password was incorect. Goodbye");
						done = true;
					}
					//if customer
					System.out.println("Please choose a menu option:");
					System.out.println("1. Apply for new bank account, 2.Check account balance, 3. Make deposit, 4. Make withdrawal, 5. Transfer to another account, 6. Accept transfer");
					int option = Integer.parseInt(in.nextLine());
					switch(option) {
						case 1:
							//Apply for new bank account
							break;
						case 2:
							//Check account balance
							break;
						case 3:
							//Make deposit
							break;
						case 4:
							//Make withdrawal
							break;
						case 5:
							//Make transfer
							break;
						case 6:
							//Accept transfer
							break;
					}
					//if employee
					System.out.println("Please choose a mnenu option:");
					System.out.println("1. View an account, 2. Accept or Reject an account, 3. View Transaction Log");
					int empOption = Integer.parseInt(in.nextLine());
					switch(empOption) {
						case 1:
							//View an account
							break;
						case 2:
							// Accept or reject an account
							break;
						case 3:
							//View transaction log
							break;
					}
				} else {
					System.out.print("Please enter you first name: ");
					String first = in.nextLine();
					System.out.println("Please enter your last name: ");
					String last = in.nextLine();
					System.out.println("Please enter a password: ");
					String password = in.nextLine();
					try {
						u = uServ.signUp(first, last, password);
						System.out.println("You may now log in with the username: " + u.getUsername());
					} catch (Exception e) {
						System.out.println("Sorry, we could not process your request");
						System.out.println("Please try again later");
						done = true;
					}
				}
			} 
		}
		
		System.out.println("Goodbye :)");
		in.close();
	}
	
}

