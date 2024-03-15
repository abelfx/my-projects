// main - main4

/* overloaded constructors = having multiple constructors in a class with the same
 * the same name but different parameters.
 * name + parameters = signature.
 */
public class overloadedpizza4 {
	String bread;
	String topping;
	String cheese;
	String sauce;
	
	overloadedpizza4(String bread,String topping,String cheese,String sauce) {
		this.bread = bread;
		this.topping = topping;
		this.cheese = cheese;
		this.sauce = sauce;
		
	}
	
	overloadedpizza4(String bread,String topping,String cheese) {
		this.bread = bread;
		this.topping = topping;
		this.sauce = cheese;
	}
	
	overloadedpizza4(String bread,String topping) {
		this.bread = bread;
		this.topping = topping;
	}
	
	overloadedpizza4(String bread) {
		this.bread = bread;
	}
		
		



}
