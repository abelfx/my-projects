// Main - Main3
import java.util.Random;

public class diceroller3 {
	
	Random random;
	int num;
	
    diceroller3() {
    	random = new Random();
		roll();
    }	
	void roll() {
		num = random.nextInt(6)+ 1;
		System.out.println(num);
	}
	
		
	

}
