package week5;

public class Customer {
	
	private String fullName;
	  private Account account;
	  public static double OPENING_BAL = 0.00;
	  
	  public Account getAccount() {
		  return account;
	  }

	  public Customer(Account account) {
		account = new Account(fullName, OPENING_BAL);
	    this.account = account;
	  }

	  public Customer(Account account, double balance) {
		account = new Account(fullName, balance);
	    this.account = account;
	    balance += OPENING_BAL;
	  }

	  public Customer(String fullName) {
	    this.fullName = fullName;
	  }

	  public void setFullName(String fullName) {
	    this.fullName = fullName;
	  }

	  public String getFullName() {
	    return fullName;
	  }

	  public void OpenAccount(String accountNumber) {
	    System.out.println("Hello, " + fullName + "! Your account is opened and ready to go! Your account number is: " + accountNumber);
	  }

	  public void CloseAccount(String accountNumber) {
	    System.out.println("Hello " + fullName + "! The following account has been closed: " + accountNumber);
	    }
	  }
