import java.util.Scanner;

public class TEST3{
	
	private static boolean bool;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num;
		
		System.out.println("ENTER AN INTEGER BETWEEN 1 AND 10: ");
		num = scanner.nextInt();
		
		while (num < 1 || num > 10) {
			System.out.println(num + " is not between 1 and 10, please try again: ");
			num = scanner.nextInt();
		}

		
		System.out.println("you are correct thank you!");
	}
}