package com.example.dao;

//import java.util.List;

import com.example.models.Account;
import com.example.models.User;
//import com.example.models.AccountDisplay;

public interface AccountDao {
	
	public void createAccount(Account a);
	
	
	//public List<AccountDisplay> getAllAccounts();
	
	public User getUserAccounts(User u);
	
	void updateAccount(Account a);
}