package code.Assignment.Singtel;

//B. Model fish as well as other swimming animals.
//Q1
public class Fish implements Bird {

	@Override
	public void walk() {
		System.out.println("Fish dont sing");
		
	}

	@Override
	public void fly() {
		System.out.println("Fish dont fly");
		
	}

	@Override
	public void sing() {
		System.out.println("Fish dont sing");
		
	}

	@Override
	public void swim() {
		System.out.println("Fish can swim");
		
	}

	@Override
	public void sound() {
		System.out.println("");
		
	}
	
	void features() {
		
	}
	
}

//Q2 - specialize the fish
// features method in sharks and clownfish class will override fish class's features method when being called.
class Shark extends Fish{
	
	@Override
	void features() {
		System.out.println("Sharks are large and grey");
		System.out.println("Sharks eat other fish");
	}
}

class ClownFish extends Fish{
	
	@Override
	void features() {
		System.out.println("Clownfish make jokes");
		System.out.println("Clownfish are small and colourful (orange)");
		
	}
	
}




