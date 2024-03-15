// Guess game 1!

// import random and scanner methods from their class!
import java.util.Random;
import java.util.Scanner;

// declare class 1!
public class MYFIRSTGAME {

	public static void main(String[] args) {
		
		// declare the imported random and assign variable to it
		Random random = new Random();
		Scanner scanner = new Scanner(System. in);
		
		// declare integer number and n
		int number;
		int guess;
		
		// call number and assign it random value
		number = random.nextInt(100);
		
		// first statement of game requiring input
		System.out.println("Guess a number between 1 and 100:");
		guess = scanner.nextInt(); 
		
		// staring loop
		while (true) {
			
			// use if to create conditions for the loop
			if (number > guess) {
				
				System.out.println("Incorrect, please try again: ");
				System.out.println("It is higher!");
				guess = scanner.nextInt();
			    continue;
			    
			}
			else if (number < guess) {
				
				System.out.println("Incorrect, please try again: ");
				System.out.println("It is lower!");
				guess = scanner.nextInt();
				continue;
			}
			
			// exiting the loop if number = guess
			else
				System.out.println("Your are correct the number is: " + number);
				break;

		}
	}
}


