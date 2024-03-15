// How to create Array of objects in java.

public class Main6 {
	public static void main(String[] args) {
		
		Arrayofobj6[] food = new Arrayofobj6[3];
		
		Arrayofobj6 food1 = new Arrayofobj6("banana");
		Arrayofobj6 food2 = new Arrayofobj6("apple");
		
		food[0] = food1;
		food[1] = food2;
		 
		System.out.println(food[0].name);
		System.out.println(food[1].name);
		
		
		
	}

}
