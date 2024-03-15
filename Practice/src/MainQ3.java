/* Write a Java program to create a class called "Bank" with a collection 
 * of accounts and methods to add and remove accounts, and to deposit 
 * and withdraw money. Also define a class called "Account" to maintain 
 * account details of a particular customer.
 */
// I did not do the add and the remove account though the rest is good;
// if you come back to this in the future and know ArrayLisr solve it bruh;
public class MainQ3 {

	public static void main(String[] args) {
		
	SubQ3 bank = new SubQ3(20000, 5000);
	SSubQ3 account = new SSubQ3("Abel", "Ethiopian");
	
	System.out.println("NAME: " + account.name);
	System.out.println("Nationality: " + account.nationality + "\n");
	
	
	System.out.println("Initial balance: " + bank.balance + "\n");
	
	bank.withdraw();
	System.out.println();
	bank.deposit();
	System.out.println();
	
//	bank.setBalance(10000);
//	bank.setInterest(3000);
//	
//	System.out.println("Initial balance: " + bank.balance + "\n");
//	
//	bank.withdraw();
//	System.out.println();
//	bank.deposit();
//	

	}

}
