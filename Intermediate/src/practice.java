import java.util.*;
public class practice{
	public static void main(String[] args) {
		// First Practice program
		
		System.out.println("THIS IS MY FIRST INDEPENDENT JAVA PROGRAM!");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String w;
		int x;
		int y;
     	int z;
	
		System.out.println("Which operation do you want: +/-/*/% ");
		w = scanner.nextLine(); 
		
		System.out.println("ENTER NUM1: ");
		x = scanner.nextInt();
		
		System.out.println("ENTER NUM2: ");
		y = scanner.nextInt();
		
		
		
		if (w.equals("+")) {
			z = x + y;
			System.out.println("Your result is: " + z);
		}
	    else if (w.equals("-")) {
			z = x + y;
			System.out.println("Your result is: " + z);
		}
		else if (w.equals("*")) {
			z = x * y;
			System.out.println("Your result is: " + z);
		}
		else if (w.equals("%")) {
			z = x/y;
			System.out.println("Your result is: " + z);
		}
		else {
			System.out.println("Enter appropriate symbol!");
		}
		
		scanner.close();
			
     	
     	
     	
     	//Another Program For Practice!!
     	
//		System.out.println("HELLO WELCOME TO GUESS:)");
//		
//		y = random.nextInt(1, 2);
//		
//		System.out.println("CONTINUE? YES/NO");
//		w = scanner.nextLine();
//		
//		if (w.equals("YES")) {
//			System.out.println("LETS GET STARTED!!");
//			
//			System.out.println("Choose a number from 1-10");
//			x = scanner.nextInt();
//			
//			System.out.println("The winning number is: " + y + "!!!");
//			
//			if (x == y) {
//				System.out.println("You have won 10,000 USD");
//			}
//			else {
//				System.out.println(x + " Is not the winning number,Try again"); 
//			}
//			
//			System.out.println("Thank you for playing");
//		}
//		else if(w.equals("NO")){
//			System.out.println("Thank you for visiting us!"); 
//		}
//		else {
//			System.out.println("Please choose the appropriate choice!");
//		}
	}
}
