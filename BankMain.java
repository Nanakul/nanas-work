package week5;

public class BankMain {

	public static void main(String[] args) {
		int routingNumber = 213256478;

	    Customer nClient = new Customer("Midi Nanakul");
	    //Account nAccount = new Account(nClient);

	    System.out.println("Client would like to open an account.");
	    
	    //Display client's full name.
	    System.out.println("Client full name: " + nClient.getFullName());
	    //Open the account with the following account number.
	    nClient.OpenAccount("2120203000");
	    System.out.println("The routing number is: " + routingNumber);
	    
	    //Deposit funds into account.
	    nClient.getAccount().depositFunds(100.00);
	    System.out.println("Your account number is: " + nClient.getAccount().getAccountNumber());
	    
	  }
	}