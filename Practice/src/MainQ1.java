/*Write a Java program to create a class called "Dog" with a name 
 * and breed attribute. Create two instances of the "Dog" class, set 
 * their attributes using the constructor and modify the attributes 
 * using the setter methods and print the updated values.
 */

public class MainQ1 {
	// Main class
		public static void main(String[] args) {
			
			SubQ1 person1 = new SubQ1("Lasi", "Shephred");
			System.out.println("The dogs name is " + person1.name);
			System.out.println("The dog is a " + person1.breed);
			
			person1.stranger();
			person1.owner();
			
			System.out.println("");
			
			person1.setName("Zoro");
			
			System.out.println("The dogs name has now been changed to " + person1.name);
			
			person1.setBreed("pitbull");
			
			System.out.println("while the breed is now changed to " + person1.breed);
			
		}
}
