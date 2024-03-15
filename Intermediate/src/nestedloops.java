import java.util.Scanner;

public class nestedloops {
	public static void main(String[] args) {
		int rows;
		int columns;
		String symbol = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter the number of columns: ");
		columns = scanner.nextInt();
		System.out.println("Enter Symbol: ");
		symbol = scanner.next();
		
		for(int i = 1; i<=rows; i++ ) {
			System.out.println();
			for(int j = 1; j<=columns; j++) {
				System.out.print(symbol);
				
				
			}
		}
		
		
	}

}
