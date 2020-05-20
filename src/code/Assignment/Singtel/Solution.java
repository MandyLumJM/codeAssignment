package code.Assignment.Singtel;

// Q1b
// Optimize the code for maintainability by creating an interface for Animal and Bird 
// By using interface, additional method can be added to implement class(Solution) easily. 
public class Solution implements Animal , Bird {

	@Override
	public void walk() {
			System.out.println("I am walking");
		
	}

	@Override
	public void fly() {
		System.out.println("I am flying");
		
	}

	@Override
	public void sing() {
		System.out.println("I am singing");
		
	}
	
	public static void main(String[] args) {
		
		Bird refBird = new Solution();
		refBird.walk();
		refBird.fly();
		refBird.sing();

	}
	
	

}
