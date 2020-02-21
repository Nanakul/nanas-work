package week5;

public class Customer {
	private String fullName;
	private Account account;
	public static double OPENING_BAL = 0.00;
	
	//Customer Constructor and Setters
	public Customer(String fullName) {
		  account = new Account(fullName, OPENING_BAL);
		  this.fullName = fullName;
	}
	
	public void setFullName(String fullName) {
		  this.fullName = fullName;
	}
	
	//Getters
	public String getFullName() {
		  return fullName;
	}
	
	public Account getAccount() {
		return account;
	}
	
	//Create and Close account methods
	public void OpenAccount(String accountNumber) {
		  System.out.println("Hello, " + fullName + "! Your account is opened and ready to go! Your account number is: " + accountNumber);
	}

	public void CloseAccount(String accountNumber) {
		  System.out.println("Hello " + fullName + "! The following account has been closed: " + accountNumber);
  	}
  }
