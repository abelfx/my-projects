import java.util.Random;
import java.util.Scanner;

public class Randomness {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Guess a random number from 1-10: ");
		int x = scanner.nextInt();
		
		if (x == 5)  {
			System.out.println("You have won your prize!!!!");	
			int prize = random.nextInt(100,1000);
			System.out.println("your prize is: " + prize);
			}
		
		else {
			System.out.println("You are incorrect! Please try again!");
		}
		
	}
}