// import scanner to ask user for input
import java.util.Scanner; 
//declare class
public class TEST4{ 
	public static void main(String[] args) {
		//calling scanner
		Scanner scanner = new Scanner(System.in); 
		// declare an integer to using in the loop
		int number;
		// declare infinite while loop
		while (true) {
			// asking to enter input
			System.out.println("Enter an integer between 1 - 10: ");
			number = scanner.nextInt();
			// continue and try again in case of incorrect answer
			if (number < 0 || number > 10)
				continue;
			// congratulate users input
			System.out.println("Congrates " + number + " is between 1 and 10");
			// exit the while loop if answer is correct
			break;
			
		
			
		}
		
	}
}