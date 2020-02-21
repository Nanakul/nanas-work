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
		if(balance < 0) {
			balance -= OVERDRAFT_FEE;
			System.out.println("You have been issued a $25 Overdraft Fee. If you would like to "
					+ "avoid these in the future, please set up Overdraft Protection.");
		}
	  }
	    

	  //Print account info
	  public void printAccountInfo() {
	    System.out.println(accountNumber);
	    System.out.println(balance);
	  }
	  
	}