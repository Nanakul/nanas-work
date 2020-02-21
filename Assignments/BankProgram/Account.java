public class Account {
	
    //Set Parameters
	private double balance;
	private String accountNumber;
	public static double MINIMUM_BAL = 0.00;
	public static double OVERDRAFT_FEE = 25.00;
	
    //Create Constructors
	public Account() {
		balance = MINIMUM_BAL;
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

          //Write an IF statement that issues an Overdraft fee if the client goes below a balance of 0.
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
