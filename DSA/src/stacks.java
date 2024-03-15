import java.util.Stack;
public class stacks {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("BANANA");
		stack.push("APPLE");
		stack.push("MANGO");
		stack.push("ORANGES");
		
	stack.peek();
	stack.search("ORANGES");
	
	// stack.pop() -- this will pop(remove) the item at the top of the stack;
		
		System.out.println(stack);
		System.out.println("But my favouite item is: " + stack.peek());
		System.out.println("The item in integer is: " + stack.search("ORANGES"));

	}

}
