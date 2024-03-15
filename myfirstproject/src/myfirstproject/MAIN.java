package myfirstproject;

import java.util.Scanner;

public class MAIN {
	 public static void main(String[] args) {
	   System.out.println("hi");
	   System.out.println("my name is Abel tesfa");
	   String x = "Potato";
	   String y = "Tomato";
	   String z;
	   z = x;
	   x = y;
	   y = z;
	   System.out.println("i love " + x);
	   System.out.println("i hate " + y);
	   int w = 15;
	   int v = 16;
	   int k = w + v;
	   System.out.println("the sum of w and v is: " + k);
	   System.out.print("What is ur sisters name: ");
	   Scanner scanner = new Scanner(System.in);
	   String name = scanner.nextLine();
	   System.out.println("wow that is a beautiful name "+ name + "!!");
			   
	   
	 }
}