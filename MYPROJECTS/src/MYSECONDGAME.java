// Game guess 2!

/* game has a bug, run it and u will easily see it,
 * i can not fix it for now so when u get better come and fix it!
 */

// import scanner to accept inputs
import java.util.Scanner;
import java.util.Random;

// declare Class 1
public class MYSECONDGAME {
	public static void main(String[] args) {
		
		// declare scanner and random
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		// declare a string
		String answer;
		
		// declare integer and use random on it
		int guess;
		guess = random.nextInt(1,100);
		
		// start loop
		while(true) {
			
			// input for string
			System.out.println("Is your number: " + guess);
			answer = scanner.nextLine();
			
			// condition for the loop
			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("Congratulations " + guess + " is the right number!!");  
				break;
			}
			
			// nested loops inside else if 
			else if (answer.equalsIgnoreCase("no")) {
				System.out.println("is it higher or lower: ");
				answer = scanner.nextLine();
				
				if (answer.equalsIgnoreCase("higher")) {
					 guess = random.nextInt(guess, 100);
					 continue;
				
				}
				else if (answer.equalsIgnoreCase("lower")) {
					 guess = random.nextInt(0,guess);
					 continue;
			}
		    // loop end
			
			
		}
			
		}

	}
}
