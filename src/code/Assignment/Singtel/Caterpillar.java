package code.Assignment.Singtel;


public class Caterpillar implements Insect{

	@Override
	public void walk() {
		System.out.println("A Caterpillar can walk (Crawl)");
		
	}

	@Override
	public void sound() {
		System.out.println("A caterpillar can make sounds");
		
	}

	@Override
	public void fly() {
		System.out.println("A caterpillar cannot fly");
		
	}

}
