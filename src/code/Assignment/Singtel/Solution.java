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
		
		Parrot refParrot = new Parrot();
		refParrot.livingWithDog(); //"Woof, woof"
		refParrot.livingWithCat(); //"Meow"
		refParrot.livingNearRooster(); //"Cock-a-doodle-doo"
		
		//4d
		refParrot.liveNearDuck(); //"Quack, quack"
		refParrot.nearPhoneRing();// "Ring, ring"
		
		
	}


	
	

}
