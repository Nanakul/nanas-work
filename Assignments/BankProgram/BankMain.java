public class BankMain {

	public static void main(String[] args) {
	
		int routingNumber = 213256478;
	
		//Create new client
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
		System.out.println("Your balance is: " + nClient.getAccount().getBalance());
	    
		//Withdraw funds from account.
		nClient.getAccount().withdrawFunds(101.00);
		System.out.println("Your balance is: " + nClient.getAccount().getBalance());
	    
		nClient.CloseAccount("2120203000");
	    
	}
}
