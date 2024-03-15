
	import java.util.Scanner;
	import java.util.Random;

public class TEST2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int numberToGuess = random.nextInt(50) + 1;
	        int numberOfTries = 0;
	        int guess;
	        boolean win = false;

	        System.out.println("Welcome to the Guessing Game!");
	        System.out.println("CHOGuess a number between 1 and 50:");

	        while (!win) {
	            guess = scanner.nextInt();
	            numberOfTries++;

	            if (guess == numberToGuess) {
	                win = true;
	            } else if (guess < numberToGuess) {
	                System.out.println("Higher! Try again:");
	            } else if (guess > numberToGuess) {
	                System.out.println("Lower! Try again:");
	            }
	        }

	        System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
	    }


}
