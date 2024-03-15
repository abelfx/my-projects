
public class DynamicArrayMain {

	public static void main(String[] args) {
		DynamicArray dynamicarray = new DynamicArray();
		
		dynamicarray.add("APPLE");
		dynamicarray.add("BANANA");
		dynamicarray.add("MANGO");
		
		dynamicarray.insert(1, "ORANGES");
	
		dynamicarray.delete("ORANGES");
		//System.out.println("What are the fruits that i like? ");
		
		System.out.println("Is the Array empty: " + dynamicarray.isEmpty());
		System.out.println(dynamicarray);
		System.out.println("Current Capacity: " +  dynamicarray.capacity);
		System.out.println("Current size: " + dynamicarray.size);
		
		
		// i am at 57:50 deletion
		
		
	}

}
