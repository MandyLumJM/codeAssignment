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
	
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		Bird refBird = new Chicken();
		refBird.sound(); // output: "Cluck, Cluck"
		refBird.fly();	 // output: "A chicken cannot fly"
		
		Bird refBird2 = new Duck();
		refBird2.sound(); // output: "Quack, Quack"
		refBird2.swim();  // output: "A duck can swim"
		

	}


	
	

}
