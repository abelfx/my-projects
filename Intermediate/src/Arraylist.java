import java.util.ArrayList;

public class Arraylist{
	public static void main(String[] args) {
		
////      1D ArrayList Practice;
		
		/* ArrayList = a resize able list
		 * Elements can be added or removed perhaps even exchanged
		 * works only on reference data types(use wrapper class)
		 */
//	ArrayList<String> food = new ArrayList<String>();
//	
//	food.add("Banana");
//	food.add("Mango");
//	food.add("Orange");
//	
//	for (int i = 0; i<= food.size(); i++) {
//		System.out.println(food.get(i));
//	}
//	
		
		
		
	// 	2D ArrayList Practice;
	
	/* 	2D ArrayList = list of lists
	 *  Elements can be added to this list during runtime
	 */
	
    ArrayList<String> food = new ArrayList<String>();
	
	food.add("Banana");
	food.add("Mango");
	food.add("Orange");
	
    ArrayList<String> beverages = new ArrayList<String>();
	
    beverages.add("Banana");
    beverages.add("Mango");
    beverages.add("Orange");
    

    ArrayList<String> icecream = new ArrayList<String>();
	
    icecream.add("vanilla");
	icecream.add("chocolate");
	icecream.add("caramelle");
	
	//Main Grocery list
	ArrayList<ArrayList<String>> grocerylist = new ArrayList();
	grocerylist.add(food);
	grocerylist.add(beverages);
	grocerylist.add(icecream);
	
	System.out.println(grocerylist.get(1).get(0));
		
	}
	
}