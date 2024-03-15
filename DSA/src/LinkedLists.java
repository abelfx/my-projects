import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		
		//// linkedlists can act as stacks
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		
//		linkedlist.push("BANANA");
//		linkedlist.push("APPLE");
//		linkedlist.push("MANGO");
//		
//		System.out.println(linkedlist);
		
		System.out.println();
		
		//// linkedlists can act as Queues
		
		linkedlist.offer("BANANA");
		linkedlist.offer("APPLE");
		linkedlist.offer("MANGO");
		
		linkedlist.add(1,"GRAPES");
		
		System.out.println(linkedlist);
		

	}

}
