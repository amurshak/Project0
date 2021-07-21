package com.example.models;


import java.util.Random;

public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
	private String userType;
	private int balance;
	
	public User() {
		//super();
	}
	
	public User(int id, String firstName, String lastName, String email, String password, String userType, int balance) {
		//super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = firstName + lastName + (new Random().nextInt(9000)+1000);
		this.password = password;
		this.userType = userType;
		this.balance = balance;
	}
	
	//To send info to the database because DB autogenerates ID
	public User(String firstName, String lastName, String email, String username, String password, String userType, int balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = firstName + lastName + (new Random().nextInt(9000)+1000);
		this.password = password;
		this.userType = userType;
		this.balance = balance;
	}
	
	//User to get info from the database
	public User(int id, String firstName, String lastName, String email, String username, String password, String userType, int balance) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = firstName + lastName + (new Random().nextInt(9000)+1000);
		this.password = password;
		this.userType = userType;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", username=" + username + ", password=" + password + ", userType=" + userType + ", balance="
				+ balance + "]";
	}
	
}
