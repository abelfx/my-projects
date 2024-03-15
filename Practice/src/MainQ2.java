/* Write a Java program to create a class called "Circle" 
 * with a radius attribute. You can access and modify 
 * this attribute. Calculate the area and circumference 
 * of the circle.
 */

public class MainQ2 {

	public static void main(String[] args) {
		
		SubQ2 circle = new SubQ2(5.4);
		
		System.out.println("The radius you entered is " + circle.radius);
		
		System.out.println("The area for this circle is: " + circle.area());
		
		System.out.println("The circumference for this circle is: " + circle.circumference());
		
		System.out.println();
		
		circle.setRadius(3);
		
        System.out.println("The new radius is " + circle.radius);
		
		System.out.println("The area for the new circle is: " + circle.area());
		
		System.out.println("The circumference for the new circle is: " + circle.circumference());
		
		

	}

}
