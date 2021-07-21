package com.example.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.example.models.Account;
import com.example.models.User;
import com.example.utils.connectionUtil;

public class AccountDaoDB implements AccountDao {	
	
	private connectionUtil conUtil = connectionUtil.getConnectionUtil();


	@Override
	public void createAccount(Account a) {
		try {
		// TODO Auto-generated method stub
		Connection con = conUtil.getConnection();
		//To use our functions/procedure we need to turn off autocommit
		con.setAutoCommit(false);
		String sql = "call create_account(?,?,?)";
		CallableStatement cs = con.prepareCall(sql);
		
		cs.setInt(1, a.getAccountNum());
		cs.setInt(2, a.getUserId());
		cs.setInt(3, a.getBalance());
		
		cs.execute();
		
		con.setAutoCommit(true);
		
		} catch(SQLException e) {
		e.printStackTrace();
		}
	}
	

	@Override
	public User getUserAccounts(User u) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void updateAccount(Account a) {
		// TODO Auto-generated method stub
		
	}


}
