package Study5;

public abstract class Unit2 {
	abstract void run();
	abstract void walk();
	abstract void attack();
	
	public void Drink() {
		System.out.println("회복포션을 마신다.");
	}

	
	abstract void sleep();
	
	Unit2 u2 = new Unit2();
	Unit u = new Unit();
}
