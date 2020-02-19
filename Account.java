package week5;

public class Account {
	
	private double balance;
	private String accountNumber;
	public static double MINIMUM_BAL = 0.00;
	public static double OVERDRAFT_FEE = 25.00;
	
	public Account() {
		balance = 0.00;
	}
	
	public Account(String accountNumber, double balance) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	  }
		
	  //Getters
	  public double getBalance() {
	    return balance;
	  }

	  public String getAccountNumber() {
	    return accountNumber;
	  }

	  //Deposit funds
	  public void depositFunds(double amount) {
	    balance += amount;
	  }

	  //Withdraw funds
	  public void withdrawFunds(double amount) {
	    balance -= amount;
	  }

	  //Print account info
	  public void printAccountInfo() {
	    System.out.println(accountNumber);
	    System.out.println(balance);
	  }
	}