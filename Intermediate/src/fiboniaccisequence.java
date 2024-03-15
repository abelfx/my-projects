// import scanner to add input
import java.util.Scanner;

// declare class
public class fiboniaccisequence {
	public static void main(String[] args) {
		
		// calling scanner and declaring int n
		Scanner scanner = new Scanner(System.in);
		  int num;
		
		// assigning num with scanner
		System.out.println("Enter index of sequence: ");
		num = scanner.nextInt();
		
		// declare and assign v1,v1 and result
		int v1 = 1;
		int v2 = 1;
		int result = 0;
		
		// fiboniacci loop start
		for (int i = 1; i <= num-2; i++ ) {
			
			  result = v1 + v2;
			  v1 = v2;
			  v2 = result;

		}
		// loop end
		
		// condition falsifying the loop
		if (num == 1 || num == 2) {
			result = 1;
		    }
		System.out.println("Result: " + result);
	} 
}

// program end