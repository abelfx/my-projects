// Guess game!
//// not complete and i do not know how to complete it yet:
import java.util.Random;
import java.util.Scanner;

public class myfirstgame{
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System. in);
		
		int number;
		int n;
		
		number = random.nextInt(1, 100);
		
		System.out.println("Guess a number between 1 and 100:");
		n = scanner.nextInt(); 
		
		while (true) {
			
			
			
			if (number > n) {
				System.out.println("Incorrect, please try again: ");
				System.out.println("It is higher!");
				n = scanner.nextInt();
			    continue;
			}
			else if (number < n) {
				System.out.println("Incorrect, please try again: ");
				System.out.println("It is lower!");
				n = scanner.nextInt();
				continue;
			}
			else
				System.out.println("Your are correct the number is: " + number);
				break;
			
			
			
			
			
		}
		
		
		
	}


}