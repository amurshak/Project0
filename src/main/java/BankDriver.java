import java.util.List;
import java.util.Scanner;

import com.example.dao.AccountDao;
import com.example.dao.AccountDaoDB;
import com.example.dao.UserDao;
import com.example.dao.UserDaoDB;
import com.example.exceptions.InvalidCredentialsException;
import com.example.models.User;
import com.example.services.AccountService;
import com.example.services.UserService;

public class BankDriver {
	
	private static UserDao uDao = new UserDaoDB();
	private static UserService uServ = new UserService(uDao);
	
	private static AccountDao aDao  = (AccountDao) new AccountDaoDB();
	private static AccountService aServ = new AccountService(aDao);
	
	
	public static void main(String[] args) {
		
		
		//UserDao uDao = new UserDaoDB();
		
		//System.out.println(uDao.getAllUsers());
		
		Scanner in = new Scanner(System.in);
		
		//This will be used to control our loop
		boolean done = false;
		
		User u = null;
		
		while(!done) {
			if(u == null) {
				System.out.println("Login or Signup? Press 1 to Login, press 2 to Signup");
				int choice = Integer.parseInt(in.nextLine());
				if(choice == 1) {
					//Check if employee or customer login
					System.out.println("Employee(e) or Customer(c) login?");
					String userType = in.nextLine();
					if(userType=="c") {
					//show customer menu
						System.out.print("Please enter your username: ");
						String username = in.nextLine();
						System.out.print("Please enter your password: ");
						String password = in.nextLine();
						try {
							u = uServ.signIn(username, password);
							System.out.println("Welcome " + u.getFirstName());
						} catch(Exception e) {
							System.out.println("Username or password was incorect. Goodbye");
							done = true;
							break;
						}
						//if customer
						System.out.println("Please choose a menu option:");
						System.out.println("1. Apply for new bank account, 2.Check account balance, 3. Make deposit, 4. Make withdrawal, 5. Transfer to another account, 6. Accept transfer");
						int option = Integer.parseInt(in.nextLine());
						switch(option) {
							case 1:
								//New Account Application
								System.out.println("Enter starting amount for your new account application:");
								int init = Integer.parseInt(in.nextLine());
								//Create new account entry with balance
								System.out.println("Please log in with employee credentials:");
								//Employee login for new account approval
								System.out.print("Please enter your username: ");
								String Eusername = in.nextLine();
								System.out.print("Please enter your password: ");
								String Epassword = in.nextLine();
								try {
									u = uServ.signIn(Eusername, Epassword);
									System.out.println("Welcome " + u.getFirstName());
									System.out.println("Would you like to approve this account? Yes (y) or No (n)");
									String response = in.nextLine();
									if(response=="y") {
										//create new account
										aServ.createAccount(init, init, init);
										System.out.println("New account created");
										
										System.out.print("Your new account #" + init +" has been approved!");
										break;
									} else {
										System.out.println("Thank you for applying, we did not approve your new account");
										break;
									}
								} catch(Exception e) {
									System.out.println("Username or password was incorect. Goodbye");
									done = true;
									break;
								}
								
							case 2:
								//Check account balance
								break;
							case 3:
								System.out.println("Please specify deposit amount & account:");
								
								//Make deposit
								break;
							case 4:
								//Make withdrawal
								System.out.println("Please specify withdrawal amount & account:");

								break;
							case 5:
								//Make transfer
								break;
							case 6:
								//Accept transfer
								break;
						}
						
					} else {
					//show employee menu
						System.out.print("Please enter your username: ");
						String username = in.nextLine();
						System.out.print("Please enter your password: ");
						String password = in.nextLine();
						try {
							u = uServ.signIn(username, password);
							System.out.println("Welcome " + u.getFirstName());
						} catch(Exception e) {
							System.out.println("Username or password was incorect. Goodbye");
							done = true;
							break;
						}
						//if employee
						System.out.println("Please choose a menu option:");
						System.out.println("1. View an account, 2. Accept or Reject an account, 3. View Transaction Log");
						int empOption = Integer.parseInt(in.nextLine());
						switch(empOption) {
							case 1:
								//View an account
								break;
							case 2:
								//View transaction log
								break;
						}
					}
					
				} else {
				//signup
					System.out.print("Please enter you first name: ");
					String first = in.nextLine();
					System.out.println("Please enter your last name: ");
					String last = in.nextLine();
					System.out.println("Please enter a password: ");
					String password = in.nextLine();
					System.out.println("Please enter an email:");
					String email  = in.nextLine();
					try {
						u = uServ.signUp(first, last, email, password);
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

