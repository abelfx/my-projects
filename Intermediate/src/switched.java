import java.util.Scanner;
public class switched {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose a number that represents a day: ");
		int day = scanner.nextInt();
		
		switch(day) {
		 case 5: System.out.println("it is monday");
		 break;
		 case 4: System.out.println("it is Tuesday");
		 break;
		 case 3: System.out.println("it is Wednesday");
		 break;
		 case 2: System.out.println("it is Thursday");
		 break;
		 case 1: System.out.println("it is Friday");
		 break;
		 case 0: System.out.println("it is Saturday");
		 break;
		 case 6: System.out.println("it is Sunday");
		 break;
		 
		}
	}

}
