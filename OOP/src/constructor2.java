// main - main2
public class constructor2 {

	String name;
	int age;
	double weight;
	
	constructor2(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;	
	}
	
	void drink() {
		System.out.println(this.name + " like to drink coffee.");
		
	}
	void food() {
		System.out.println(this.name + " enjoys eating Cheese burger.");
	}
}
