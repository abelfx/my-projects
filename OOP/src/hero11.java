import java.util.*;

public class hero11 extends person11{
	
	String power;

	hero11(String name, int age, String power) {
		super(name, age);
		this.power = power;
	}
	
	public String toString() {
		return super.toString() + this.power;
	}
}
