import java.util.Scanner;
public class loops {

	public static void main(String[] args) {
		// Study of the java while loop
		Scanner scanner = new Scanner(System.in);
		String name = "";
		while(name.isBlank()) {
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		}
	    System.out.println("HELLO " + name);
	    for (int i = 10; i>=0; i-- ) {
	    	System.out.println(i);
	    	
	    }
	    System.out.println("HAPPY NEW YEAR!!");
	}

}
