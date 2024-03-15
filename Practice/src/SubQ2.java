// circle class
public class SubQ2 {
	
	double radius;
	SubQ2(double radius) {
		this.radius = radius;
	}
	
	double area() {
		return 3.14*radius*radius;
	}
	
	double circumference() {
		return 3.14*radius*2;
	}
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

}
