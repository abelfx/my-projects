
public class SubQ1 {
	
	String name ;
	String breed ;
	
	SubQ1(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	void stranger() {
		System.out.println("If the dog sees a stranger it barks");
		
	}
	
	void owner() {
		System.out.println("The dog becomes happy when it owner comes");
	}
	
	public String getName() {
		return name;
	
	}
	
	public void setName(String name) {
		this.name = name;
	}
 
	public String getBreed() {
		return breed;
		
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
}


