import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter a number between 1-10");
		num = scanner.nextInt();
		
		for (int i = 0 ; i < 1 || i > 10; i++) {
			
			System.out.println("Incorrect try again please: ");
			i = scanner.nextInt();
			
		}
		
		System.out.println("CORRECT!! thank you for playing!");

	}

}
