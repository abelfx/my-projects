// sub - vechicle9, car9, bike9

/*inheritance = the process in which one class acquires the methods
 * and attributes of other class.
 */

public class Main9 {

	public static void main(String[] args) {
		car9 car = new car9();
		bike9 bike = new bike9();
		
		car.drive();
		bike.stop();
		
		
		System.out.println(car.doors);
		System.out.println(bike.pedals);
	}

}
