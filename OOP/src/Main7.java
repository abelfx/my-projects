// sub - objectpassing7
// how to pass objects as arguments to a method

public class Main7 {
	public static void main(String[] args) {
		
		objectpassing7 car1 = new objectpassing7("BMW");
		objectpassing7 car2 = new objectpassing7("Mercedes");

		
		Garage7 garage = new Garage7();
		
		garage.park(car1);
		garage.park(car2);
		
		
	}

}
