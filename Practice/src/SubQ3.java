// bank class
public class SubQ3 {
	
	double balance;
	double interest;
	double newbalance;
	
	SubQ3(double balance, double interest) {
		this.balance = balance;
		this.interest = interest;
	}
	
	void deposit() {
		newbalance = balance + interest;
		 System.out.println("You deposited: " + interest + ".\nYour new balance is: " + newbalance);
	 }
	
	 void withdraw() {
		 newbalance = balance - interest;
		 System.out.println("You withdrew: " + interest + ".\nYour new balance is: " + newbalance);
	 }
	 
	 double getBalance() {
		 return balance;
		 
	 }
	 
	 void setBalance(double balance) {
		 this.balance = balance;
		 
	 }
	 
	 double getInterest() {
		 return interest;
		 
	 }
	  
	 void setInterest(double interest) {
		 this.interest = interest;
	 }
	 

}
