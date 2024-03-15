
public class Methods {
	
	//// Introduction to Methods;
	// Methods : a block of code that is executed whenever it is called upon
	
//	public static void main(String[] args) {
//		
//		String name = "ETHIOAPEX";
//		
//		hello(name);
//	}
//	
//	static void hello(String channalname) {
//		System.out.println("HELLO "+ channalname);
//	}
	
	
    ///// Use of return option in Methods
//    public static void main(String[] args) {
//		
//		int x = 5;
//		int y = 8;
//		
//		operation(x, y);
//		System.out.println(x+y);
//	}
//	
//	static int operation(int x, int y) {
//		return x+y;
//		
//	}
	
	
	////// OVERLOADED METHODS IN 

	// Overloaded Methods : These are methods with the same name but different parameters.
	// Method signature = Method name + parameters
//	
//	public static void main(String[] args) {
//		
//		int x = add(5,6);
//		System.out.println(x);
//	}
//	
//	static int add(int a, int b) {
//		System.out.println("SUM OF 2 INTEGERS");
//		return a+b;
//		
//	}
//    static int add(int a,int b, int c) {
//    	System.out.println("SUM OF 3 INTEGERS");
//    	return a+b+c;
//  	
//	}
//    static int add(int a, int b, int c, int d) {
//    	System.out.println("SUM OF 3 INTEGERS");
//    	return a+b+c+d;
    	
//	}
	
	
	////// Printf() METHOD STUDIES
	/* Printf() : is an optional method that is used to control, format and Display text 
	 * in the console window;
	 *  2 Argumnets are necessary: Format string + objects/variables/values;
	 *  %[flag][precision][coversion character][width]
	 */
	
	public static void main(String[] args) {
		
		int x = 19;
		String name = "Ethioapex";
		char pre = 'E';
		boolean goodlookin = true;
		double y = 1000;
		
		/* Conversion character 
		 * %d - integer
		 * %b - boolean
		 * %s - string
		 * %c - character
		 * %f - float
		 */
		System.out.printf("What is my channal name? %s", name);
		System.out.println();
		System.out.printf("Am i good looking? %b", goodlookin);
		System.out.println();
		System.out.printf("How old am i? %d", x);
		System.out.println();
		System.out.printf("what is my skill out of 1000: %f", y);
		System.out.println();
		
		/* WIDTH
		 * this is achieved by just adding numbers infront of the conversion character
		 * Eg: %10s - this will create 10 spacebars before printing the String.
		 */
		System.out.printf("What is my channal name? %10s", name);
		System.out.println();
		System.out.printf("Am i good looking? %5b", goodlookin);
		
		/* Precision
		 * this is achieved by just adding a full stop infront of the conversion character
		 * Eg: %.2s only when the data types are floats and variables
		 */
		System.out.printf("How old am i? %d", x);
		System.out.println();
		System.out.printf("what is my skill out of 1000:  %.2f", y);
		System.out.println();
		
		// flags
		// i'm bored so imma write them later maybe hehehe

	}
  

}
