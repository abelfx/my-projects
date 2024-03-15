// Main - Main8
// static method/modifier = creates and shares a single copy of variable/method.
// the class owns the static member that is acting inside it!

public class Staticmodifier8 {
	
	static int numberf;
	String name;

	Staticmodifier8(String name) {
		this.name = name;
		numberf++;
	
	}
	
	static void displaynames() {
		System.out.println("you have " + numberf + " friends!");
	}
}
