// Guess game!
import java.util.Random;
import java.util.Scanner;


public class TEST{
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System. in);
		
		String hint;
		
		
		System.out.println("Choose a number from  1 - 100: ");
		int num = random.nextInt(0, 100);
		
		System.out.println("is the number you have guessed: " + num);
		
		if (num == 21) {
			
			System.out.println("Correct, you have got the answer!");
			
		}
		
		else if (num != 21) {
			
			for(int i = 0; i<100;i++) {
				
				System.out.println(i);
				hint = scanner.nextLine();
				
				if (hint.equals("higher")) {
					
					
				}
			}
		}

		
		
		
	}
}