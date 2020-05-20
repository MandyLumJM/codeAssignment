package code.Assignment.Singtel;

//B. Model fish as well as other swimming animals
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
	
}


