// sub - constructor2
public class Main2 {
	public static void main(String[] args) {
		
		constructor2 human1 = new constructor2("John", 19, 72.3);
		constructor2 human2 = new constructor2("Martha", 19, 52.3);
		
		human1.drink();
		human2.food();
		
		System.out.println(human1.name + "is funny");
		System.out.println(human1.name + " is " + human1.age + " years of age");
		System.out.println(human2.name + " likes " + human1.name + " but her weight is " + human2.weight + "Kg");
		
	}
	

}
