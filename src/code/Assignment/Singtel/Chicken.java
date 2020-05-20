package code.Assignment.Singtel;

public class Chicken implements Bird {	

	@Override
	public void fly() {
		System.out.println("A chicken cannot fly");
		
	}

	@Override
	public void sound() {
		System.out.println("Cluck, cluck");
		
	}

	@Override
	public void walk() {
		System.out.println("A chicken can walk");
		
	}

	@Override
	public void sing() {
		System.out.println("A chicken can sing");
		
	}

	@Override
	public void swim() {
		System.out.println("A chicken cannot swin");
		
	} 
}

// 3a
class Rooster extends Chicken{
	@Override
	public void sound() {
		System.out.println("Cock-a-doodle-doo");
	}
}


